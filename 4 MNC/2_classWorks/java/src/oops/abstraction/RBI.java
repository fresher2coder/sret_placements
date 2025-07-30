package oops.abstraction;


//Abstract Class: RBI
abstract public class RBI {

	// Concrete Method - Fully defined
	 public void openGovtAccount() {
	     System.out.println("Opening Government Account (Handled by RBI)");
	 }
	
	 // 🔹 Abstract Method - No body, must be implemented by child classes
	 public abstract void savingInterestRate();  // Every bank must define its own interest
}

//Concrete Class: SBI
class SBI extends RBI {

	 //Own Method - SBI-specific functionality
	 public void openCurrentAccount() {
	     System.out.println("Opening Current Account at SBI");
	 }
	
	 //Implementing abstract method from RBI
	 @Override
	 public void savingInterestRate() {
	     System.out.println("SBI Savings Interest Rate: 6.5%");
	 }
}

//Concrete Class: IOB
class IOB extends RBI {

	 //Own Method - IOB-specific functionality
	 public void openCurrentAccount() {
	     System.out.println("Opening Current Account at IOB");
	 }
	
	 //Implementing abstract method from RBI
	 @Override
	 public void savingInterestRate() {
	     System.out.println("IOB Savings Interest Rate: 7.0%");
	 }
}

