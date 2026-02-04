package main.work;

public class Train extends Vehicle {
    public Train(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Train is running");
    }
}
