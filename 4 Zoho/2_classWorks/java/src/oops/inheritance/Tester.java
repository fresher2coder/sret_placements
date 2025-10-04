package oops.inheritance;

public class Tester {

	public static void main(String[] args) {

		PremiumCustomer dk = new PremiumCustomer("Dineshkumar", 9445750347l, "dk@gmail.com", 1, "dk street", "Chennai", "TamilNadu", 600059);
		PremiumCustomer dd = new PremiumCustomer("Divya Dineshkumar", 9445750456l, "dd@gmail.com", 2, "dd street", "Chennai", "TamilNadu", 600059);
		
//		System.out.println(dk.discountPer);
//		System.out.println(dk.name);
		
		System.out.println(dk);
		
		System.out.println();
		
		System.out.println(dd);
	}

}
