package main.work;

public class Company {
    private String name;
    private String id;

    public Company(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    // Base method
    public double getSalary() {
        return 0; // default
    }

    public String getInfo() {
        return "ID: " + id + ", Name: " + name;
    }
}
