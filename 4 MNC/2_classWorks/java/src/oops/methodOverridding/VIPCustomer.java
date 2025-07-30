package oops.methodOverridding;

public class VIPCustomer extends PremiumCustomer {

    public VIPCustomer(String name) {
        super(name);
        this.discount = 30;  // Override discount
    }

    @Override
    public void billing(double amount) {
        double discounted = (100 - discount) / 100.0 * amount;
        System.out.println(name + " paid after 30% discount: ₹" + (int)discounted);
    }
}
