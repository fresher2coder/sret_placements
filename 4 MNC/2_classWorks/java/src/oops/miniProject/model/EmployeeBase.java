package oops.miniProject.model;

public abstract class EmployeeBase {
    public String name;
    public int id;
    public double salary;

    public EmployeeBase(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void displayInfo();
}

