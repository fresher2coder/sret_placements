package java_oops.employee;

public class Tester {

	public static void main(String[] args) {
		
		int a = 10;
		Employee emp1 = new Employee("DK", 101, "Chennai");
		
		emp1.display();
		
		Person dk = new Person("S24 ultra", "Dell", "Kwid", "DDD", "DD");
//		System.out.println(dk.mobile);
		System.out.println(dk.getLaptop());
		dk.setLaptop("MacBook");
		System.out.println(dk.car);
		System.out.println(dk.guestHouse);
		
		
	}

}
