package java_oops.inheritance;

public class Demo {	

	public static void main(String []arg) {
		
		Customer dkCust = new Customer("DK", 9445750347l, "cust1");
		System.out.println(dkCust.name);
	}	
	
}

class Person{
	String name;
	long mobile;
	
	public Person(String name, long mobile) {
		System.out.println("Person Constructor");
		this.name = name;
		this.mobile = mobile;
	}	
}

class Customer extends Person{
	String custId;
	String orders[];
	public Customer(String name, long mobile, String custId) {		
		super(name, mobile);
		System.out.println("Customer Constructor");
		this.custId = custId;
	}
	
}

class PremiumCustomer extends Customer{
	float discount;
}

class VIPCustomer extends PremiumCustomer{
	int rewardPoints;
}

//cse - 100 basic
//placement - basic(cse), offers
// single, multilevel, mulitple(X expect in interface) 
