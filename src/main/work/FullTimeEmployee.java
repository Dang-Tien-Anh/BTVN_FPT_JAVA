package main.work;

public class FullTimeEmployee extends Company {
    private double fixedSalary;

    public FullTimeEmployee(String name, String id, double fixedSalary) {
        super(name, id);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getSalary() {
        return fixedSalary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Salary: " + fixedSalary;
    }
}
