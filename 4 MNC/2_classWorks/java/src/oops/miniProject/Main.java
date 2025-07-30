package oops.miniProject;

import oops.miniProject.model.*;
import oops.miniProject.exception.InvalidEmployeeException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EmployeeBase> employees = new ArrayList<>();

        try {
            Developer d1 = new Developer("Alice", 101, 70000, "Java");
            Manager m1 = new Manager("Bob", 102, 90000, 5);
            Developer d2 = new Developer("Eve", 103, -40000, "Python"); // ❌ Invalid

            addEmployee(employees, d1);
            addEmployee(employees, m1);
            addEmployee(employees, d2); // throws

        } catch (InvalidEmployeeException e) {
            System.out.println("❌ Failed to add employee: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Unexpected error: " + e);
        } finally {
            System.out.println("✅ Employee addition process completed.\n");
        }

        // Display info and bonus
        for (EmployeeBase emp : employees) {
            emp.displayInfo();
            if (emp instanceof BonusEligible bonusEmp) {
                System.out.println("💰 Bonus: ₹" + bonusEmp.calculateBonus() + "\n");
            }
        }
    }

    public static void addEmployee(List<EmployeeBase> list, EmployeeBase emp) throws InvalidEmployeeException {
        if (emp.salary < 0) {
            throw new InvalidEmployeeException("Salary cannot be negative for " + emp.getClass().getSimpleName());
        }
        list.add(emp);
    }
}

