package main.work;

public class PartTimeEmployee extends Company {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, String id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Hours: " + hoursWorked + ", Rate: " + hourlyRate;
    }
}
