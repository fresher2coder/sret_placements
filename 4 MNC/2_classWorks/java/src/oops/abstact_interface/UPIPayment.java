package oops.abstact_interface;

public class UPIPayment implements PaymentMode {

    @Override
    public void authenticate() {
        System.out.println("Authenticating UPI ID...");
    }

    @Override
    public void paymentProcess() {
        System.out.println("Processing payment through UPI.");
    }
}

