package oops.oopsBasic;

public class Student {

	//static variable - belongs to the class - memory allocated only once
	static String college;
	static int no;
	
	//instance variables	
	int rollNo;
	String name;
	Address address; //Aggregation
	long mobile;
	String email;
	
	float marks[];
	
	//only once - when the class loads
	static {
		college = "SRET";
		no = 1000;
	}
	
	public Student() {
		System.out.println("Welcome to SRET");
		
	}
		
	//every time when the object is created
	public Student(String name, long mobile, String email) {
		this();			
		this.rollNo = ++no;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	public void avgMark() {
		System.out.println("Avg Mark");
	}
	
	public void details() {
		System.out.println("Student Details");
		System.out.println("RollNo: " + rollNo);
		
		avgMark();	
	}

	@Override
	public String toString() {
		return "Student [college=" + college + ", rollNo=" + rollNo + ", name=" + name + ", mobile=" + mobile
				+ ", email=" + email + "]";
	}
	
	

}
