package oops.exceptionhandling;

import java.io.IOException;

// Custom checked exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom unchecked exception
class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

public class BankingApp {

    static void processLoanApplication(int age, double amount) throws InsufficientFundsException, IOException {
        if (age < 18) {
            throw new InvalidTransactionException("User must be 18+ to apply for loan."); // unchecked
        }

        if (amount > 100000) {
            throw new IOException("Loan limit exceeded for online application."); // checked
        }

        if (amount < 1000) {
            throw new InsufficientFundsException("Amount too low for loan processing."); // custom checked
        }

        System.out.println("Loan Application Processed for amount: " + amount);
    }

    public static void main(String[] args) {
        try {
            int userAge = 20;
            double loanAmount = 2000;

            try {
                // ArithmeticException demo (divide by 0)
                int interestRate = 10;
                int months = 0;  // Invalid
                int emi = interestRate / months; // ❌ ArithmeticException here
                System.out.println("EMI: " + emi);

                processLoanApplication(userAge, loanAmount);

            } catch (InsufficientFundsException e) {
                throw new RuntimeException("Chained: Loan rejected due to low amount.", e); // exception chaining

            } catch (ArithmeticException e) {
                System.out.println("❌ Math error: " + e.getMessage());
            }

        } catch (InvalidTransactionException e) {
            System.out.println("❌ Invalid Transaction: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("❌ IO Error: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("❌ Runtime Error: " + e.getMessage());
            System.out.println("👉 Root cause: " + e.getCause());

        } finally {
            System.out.println("✅ Closing DB connection... (finally block executed)");
        }

        System.out.println("➡ App continues...");
    }
}

