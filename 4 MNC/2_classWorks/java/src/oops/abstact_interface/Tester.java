package oops.abstact_interface;

public class Tester {
    public static void main(String[] args) {
    	
    	float a = 10;
    	
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
        
        PaymentMode pd;
        
        //runtime
        pd = new UPIPayment();
        pd = new CreditCard();
       
    }
}

