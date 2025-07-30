package oops.abstact_interface;

public class Tester {
    public static void main(String[] args) {
        PaymentMode upi = new UPIPayment();
        upi.greetUser();
        upi.authenticate();
        upi.paymentProcess();

        System.out.println();

        PaymentMode creditCard = new CreditCard();
        creditCard.greetUser();
        creditCard.authenticate();
        creditCard.paymentProcess();

        // Static method from interface
        PaymentMode.displayLimit();
    }
}

