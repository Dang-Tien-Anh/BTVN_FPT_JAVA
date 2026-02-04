package main.work;

public class Bike extends Vehicle {
    public Bike(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Bike is riding");
    }
}
