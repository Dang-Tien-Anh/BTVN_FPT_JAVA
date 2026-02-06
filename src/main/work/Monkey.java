package main.work;

public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Monkey eats banana");
    }
}
