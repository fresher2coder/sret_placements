package oops.abstact_interface;


public class CreditCard implements PaymentMode {

    @Override
    public void authenticate() {
        System.out.println("Verifying Credit Card credentials...");
    }

    @Override
    public void paymentProcess() {
        System.out.println("Processing payment through Credit Card.");
    }
}

