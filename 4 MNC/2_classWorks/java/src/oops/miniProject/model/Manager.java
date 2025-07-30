package oops.miniProject.model;

public class Manager extends EmployeeBase implements BonusEligible {

    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("👔 Manager: " + name + " | ID: " + id + " | Team size: " + teamSize);
    }

    @Override
    public double calculateBonus() {
        return 0.15 * salary;
    }
}

