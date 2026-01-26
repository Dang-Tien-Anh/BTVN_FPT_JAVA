package main.work;

public class SinhVien {
    private String id;
    private String name;
    private int age;
    private double averageScore;

    public void Student(String id, String name, int age, double averageScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getAverageScore() { return averageScore; }
    public void setAverageScore(double averageScore) { this.averageScore = averageScore; }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Score: " + averageScore);
    }

}
