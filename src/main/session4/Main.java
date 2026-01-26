package main.session4;

public class Main {
    public static void main(String[] args){
        Student s = new Student(1,"a","b");
        s.study();
//        s.playGame();
        FPTStudent f = new FPTStudent(2,"c","d","A");
        f.study();
        f.playGame();
        AptechStudent a = new AptechStudent(3,"A","B","C","D");
        a.study();
        a.playGame();
        a.run();
        a.run(5);
        a.run("a");
    }
}
