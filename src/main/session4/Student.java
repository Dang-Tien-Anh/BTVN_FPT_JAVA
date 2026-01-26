package main.session4;

public class Student {
    private Integer id;
    public String name;
    public String email;

    public Student(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void study(){
        System.out.printf("Student study...");
    }
}
