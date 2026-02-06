package main.work;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }
}