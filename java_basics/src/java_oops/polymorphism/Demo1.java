package java_oops.polymorphism;

public class Demo1 {

	public static void main(String[] args) {
		
		
		PreEmployee dk = new PreEmployee(50000);
		
		System.out.println(dk.salary());

	}

}

class Employee{
	double salary;
	public Employee(double salary) {
		this.salary = salary;
	}
	double salary() {
		return 1.1 * salary;
	}
}

class PreEmployee extends Employee{

	public PreEmployee(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected double salary() {
		return 1.2* salary;
	}
	
}

