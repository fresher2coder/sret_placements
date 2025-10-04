package oops.methodOverridding;


public class PremiumCustomer extends Customer {

    float discount;

    // Constructor sets discount and calls super constructor
    public PremiumCustomer(String name) {
        super(name);
        this.discount = 20;  // 20% discount
    }

    // Method overriding
    @Override
    public void billing(double amount) {
        double discounted = (100 - discount) / 100.0 * amount;
        System.out.println(name + " paid after 20% discount: ₹" + (int)discounted);
    }
}

