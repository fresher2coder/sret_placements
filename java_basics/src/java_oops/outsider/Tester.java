package java_oops.outsider;

import java_oops.employee.Person;

public class Tester extends Person {
	
	public static void main(String[] args) {
		Person dk = new Person("S24 ultra", "Dell", "Kwid", "DDD", "DD");
		System.out.println(dk.mobile);
		System.out.println(dk.car);
		System.out.println(dk.guestHouse);

	}

}
