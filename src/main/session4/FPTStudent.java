package main.session4;

public class FPTStudent extends Student{
    private String avatar;

    public FPTStudent(Integer id, String name, String email, String avatar) {
        super(id, name, email);
        this.avatar = avatar;
    }

    public void playGame(){
        System.out.printf("Play game");
        System.out.printf("Play game");
        System.out.printf("Play game");
        System.out.printf("Play game");
        System.out.printf("Play game");
    }
}
