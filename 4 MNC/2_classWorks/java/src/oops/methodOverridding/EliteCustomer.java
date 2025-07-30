package oops.methodOverridding;

public class EliteCustomer extends VIPCustomer {

    public EliteCustomer(String name) {
        super(name);
        this.discount = 40;  // Further overridden
    }

    @Override
    public void billing(double amount) {
        double discounted = (100 - discount) / 100.0 * amount;
        System.out.println(name + " paid after 40% discount: ₹" + (int)discounted);
    }
}
