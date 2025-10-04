package oops.inheritance;

public class Address {

	
	static String country;
	
	int doorNo;
	String street, city, state;
	int pincode;
	
	static {
		country = "India";
	}
	
	public Address(int doorNo, String street, String city, String state, int pincode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.state = state;		
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + "]";
	}	
	
	
}
