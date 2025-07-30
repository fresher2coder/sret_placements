package oops.abstraction.rideBookindSystem;

//Abstract base class
abstract class Ride {
 String customerName;
 float distance; // in kilometers

 // Constructor
 public Ride(String customerName, float distance) {
     this.customerName = customerName;
     this.distance = distance;
 }

 // Concrete method: same for all rides
 public void showCustomer() {
     System.out.println("Customer: " + customerName);
 }

 // Abstract methods to be implemented by subclasses
 abstract void showRideType();
 abstract void calculateFare(); 
}
