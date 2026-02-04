package main.session5;

public abstract class Person { // đây là 1 class abstract (trừu tượng)
    private String fullName;
    private String dob;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public abstract void eat(); // abstract function
    public abstract void sleep();
}