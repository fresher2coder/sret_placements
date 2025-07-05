package java_oops.employee;

public class Employee {
	
	String name;
	int empId;
	String address;
	static String companyName;
	
	public Employee() {
		System.out.println("Welcome to SRET");
	}	

	public Employee(String name) {
		this();
		this.name = name;
	}

	public Employee(String name, int empId, String address) {
		this(name);
		
		this.empId = empId;
		this.address = address;
	}
	
	public void display() {
		System.out.println(name);
	}
	
	
	
	
}

/*
 * byte short int long float double char boolean
 * Byte Short ....
 * 
 * 
 *class object constructor this
 *Access Modifier - private, default, protected, public, Encapsulation
 *inheritance
 *polymorphism
 *Abstraction
 *Exception Handling
 *
 *Multi-Threading
 *
 * 
 * */
