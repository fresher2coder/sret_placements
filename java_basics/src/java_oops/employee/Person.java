package java_oops.employee;

public class Person {

	private String mobile;
	private String laptop;
	String car;
	protected String guestHouse;
	public String house;
	public Person(String mobile, String laptop, String car, String guestHouse, String house) {
		super();
		this.mobile = mobile;
		this.laptop = laptop;
		this.car = car;
		this.guestHouse = guestHouse;
		this.house = house;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}	
}
