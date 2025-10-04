package oops.encapsulation;

public class Tester {

	public static void main(String[] args) {
		
		Person dk = new Person();
		
//		System.out.println(dk.mobile);
		System.out.println(dk.getLaptop());
		
//		dk.laptop = "MacBook";
		dk.setLaptop("MacBook");
		System.out.println(dk.getLaptop());
		System.out.println(dk.house);
		System.out.println(dk.car);
		System.out.println(dk.guestHouse);
	}

}
