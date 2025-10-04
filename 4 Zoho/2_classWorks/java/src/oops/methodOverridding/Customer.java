package oops.methodOverridding;

public class Customer {
	
	// static variable - shared by all objects of the class
	static String company;

	// instance variable - specific to each object
	String name;

	// static block - runs only once when the class is loaded
	static {
		company = "Amazon"; // ✅ allowed - static context accessing static variable

		// ❌ Cannot access 'name' here because it's a non-static (instance) variable
		// name = "Alice"; // This would cause a compile-time error

		/*
		 * ❗ Why not allowed?
		 * The static block belongs to the class, not to any object.
		 * But 'name' belongs to an object instance.
		 * At this point, no object is created yet — so there's no 'name' to refer to.
		 * this keyword - cant point the current obj
		 */
	}

	// static method - can be called without creating an object
	static public void getCompany() {
		System.out.println(Customer.company);

		// ❌ Cannot use 'name' here either
		// System.out.println(name); // ERROR: Cannot make a static reference to the non-static field 'name'

		/*
		 * Same reason as above: 'name' requires an object, but static methods
		 * can be called without any object.
		 */
	}

	// constructor - used to initialize instance variables when object is created
	public Customer(String name) {
		super();
		this.name = name;
	}

	// instance method - can access both static and non-static members
	protected void billing(double amount) {
		System.out.println("Paid:" + amount);
	}
}
