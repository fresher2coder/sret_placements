package oops.inheritance;

//import oopsBasic.Address;

public class Customer {	
	
	private long aadharNo;	
	String name;
	long mobile;
	String email;
	
	Address address;
	
	static {
		System.out.println("Customer Static");
	}
	
	
	public Customer(String name, long mobile, String email, int doorNo, String street, String city, String state, int pincode) {
		super();
		
		System.out.println("Registered as Customer");
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		
		this.address = new Address(doorNo, street, city, state, pincode);
	}	
	
	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobile=" + mobile + ", email=" + email + "]" + "\n" + address.toString();
	}	
}

class PremiumCustomer extends Customer {
	
	float discountPer;
	
	static {
		System.out.println("Premium Customer Static");
	}

	public PremiumCustomer(String name, long mobile, String email, int doorNo, String street, String city, String state, int pincode) {
		super(name, mobile, email, doorNo, street, city, state, pincode);		
		System.out.println("Promoted to Premium");
		
		this.discountPer = 10;
	}

	@Override
	public String toString() {
		
		return super.toString() + "\n" + "PremiumCustomer [discountPer=" + discountPer + "]";
	}

	
	
	
	
	
}

