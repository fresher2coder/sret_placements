package oops.methodOverridding;

public class CustomerTester {
    public static void main(String[] args) {

        // Access static method
        Customer.getCompany();
        System.out.println();

        // Create base customer
        Customer c1 = new Customer("Alice");
        c1.billing(1000);  // No discount

        // Premium customer
        PremiumCustomer c2 = new PremiumCustomer("Bob");
        c2.billing(1000);  // 20% discount

        // VIP customer
        VIPCustomer c3 = new VIPCustomer("Charlie");
        c3.billing(1000);  // 30% discount

        // Elite customer
        EliteCustomer c4 = new EliteCustomer("Diana");
        c4.billing(1000);  // 40% discount
    }
}

