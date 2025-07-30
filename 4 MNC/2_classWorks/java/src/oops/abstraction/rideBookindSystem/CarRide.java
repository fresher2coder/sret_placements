package oops.abstraction.rideBookindSystem;

public class CarRide extends Ride {

    public CarRide(String customerName, float distance) {
        super(customerName, distance);
    }

    @Override
    void showRideType() {
        System.out.println("Ride Type: Car");
    }

    @Override
    void calculateFare() {
        float fare = distance * 15.0f; // ₹15 per km
        System.out.println("Fare: ₹" + fare);
    }
}

