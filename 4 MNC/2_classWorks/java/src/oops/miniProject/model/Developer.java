package oops.miniProject.model;

public class Developer extends EmployeeBase implements BonusEligible {

    private String techStack;

    public Developer(String name, int id, double salary, String techStack) {
        super(name, id, salary);
        this.techStack = techStack;
    }

    @Override
    public void displayInfo() {
        System.out.println("👨‍💻 Developer: " + name + " | ID: " + id + " | Tech: " + techStack);
    }

    @Override
    public double calculateBonus() {
        return 0.10 * salary;
    }
}

