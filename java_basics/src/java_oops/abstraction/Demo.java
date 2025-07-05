package java_oops.abstraction;

public class Demo {

	public static void main(String[] args) {


		SBI sbi = new SBI();
		sbi.savingsInterest();
		
		Axis axis = new Axis();

	}

}

//abstration - abstract class, interface

abstract class RBI{
	
	void govtAccount() {
		
	}
	abstract double savingsInterest();
}
class SBI extends RBI{
	
	@Override
	double savingsInterest() {
		return 0.5;
	}
}

abstract class Axis extends RBI{
	
	
}

/*
 * 1. can have concrete and abstract methods
 * 2. it cant be instantiated
 * 3. keyword - abstract
 * 4. child class of a abc class -> should implement all the abc methods
 */
