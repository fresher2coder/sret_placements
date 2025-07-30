package oops.oopsBasic;

public class Tester {

	public static void main(String[] args) {	
		
		
		System.out.println(Student.college);
						
		Student dk = new Student("Dineshkumar", 9445750347l, "dk@gmail.com");
		System.out.println("Tester: " + dk);
		
		
		Student dd = new Student("Divya Dineshkumar", 9445750457l, "dd@gmail.com");
		System.out.println("Tester: " + dd);
		
		
		dk.details();
		dd.details();
	

	}

}
