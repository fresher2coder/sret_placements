package oops.abstact_interface;


public interface PaymentMode {

    long MAX_AMOUNT = 10000;
    boolean isAuthenticated = false;

    // Default method with body
    default void greetUser() {
        System.out.println("Welcome to the Payment Gateway");
    }

    // Static method with body
    static void displayLimit() {
        System.out.println("Maximum allowed amount: " + MAX_AMOUNT);
    }

    // Abstract methods
    void authenticate();
    void paymentProcess();
}

