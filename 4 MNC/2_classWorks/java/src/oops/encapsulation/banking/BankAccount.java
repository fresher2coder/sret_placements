package oops.encapsulation.banking;

public class BankAccount {

    // PRIVATE: Completely hidden from outside classes
    private double balance;

    // DEFAULT: Accessible only within the same package
    String accountType;

    // PROTECTED: Accessible within same package + subclasses (even in different packages)
    protected String branchCode;

    // PUBLIC: Accessible from anywhere
    public String accountHolderName;

    // Constructor (public)
    public BankAccount(String name, String type, String branchCode, double initialBalance) {
        this.accountHolderName = name;
        this.accountType = type;
        this.branchCode = branchCode;
        setBalance(initialBalance);
    }

    // PRIVATE: Internal logic, only this class can use
    private void logTransaction(String message) {
        System.out.println("[LOG] " + message);
    }

    // PUBLIC: Can be accessed outside to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            logTransaction("Deposited: " + amount);
        }
    }

    // PUBLIC: Can be accessed to view balance
    public double getBalance() {
        return balance;
    }

    // PUBLIC: Withdraw with basic validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            logTransaction("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // PRIVATE SETTER: Encapsulated validation for balance
    private void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }
}

