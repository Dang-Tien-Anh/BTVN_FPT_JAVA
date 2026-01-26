package main.session4;

public class AptechStudent extends FPTStudent{
    public String account;

    public AptechStudent(Integer id, String name, String email, String avatar, String account) {
        super(id, name, email, avatar);
        this.account = account;
    }

    public void playGame(){ // override method
        System.out.printf("APTECH Student play game....");
    }
    // overload - nạp chồng
    public void run(){
        super.playGame();
        System.out.printf("running 5km/h");
    }
    public void run(int x){
        System.out.printf("running 10km/h");
    }
    public void run(String msg){
        System.out.printf("20km/h");
    }

    public void sing(String s, int a){

    }
    public void sing(int a, String s){

    }

}
