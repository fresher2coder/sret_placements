package oops.encapsulation.banking;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi", "Savings", "BR123", 5000);

        // Accessible (public)
        System.out.println("Account Holder: " + acc.accountHolderName);

        // Accessible (default - same package)
        System.out.println("Account Type: " + acc.accountType);

        // Accessible (protected - same package)
        System.out.println("Branch Code: " + acc.branchCode);

        // Not accessible (private)
        // System.out.println(acc.balance); ❌ Compile-time error

        acc.deposit(2000);
        acc.withdraw(1000);
        System.out.println("Final Balance: ₹" + acc.getBalance());
    }
}

