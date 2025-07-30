package oops.abstraction.rideBookindSystem;

public class AutoRide extends Ride {

    public AutoRide(String customerName, float distance) {
        super(customerName, distance);
    }

    @Override
    void showRideType() {
        System.out.println("Ride Type: Auto");
    }

    @Override
    void calculateFare() {
        float fare = distance * 10.0f; // ₹10 per km
        System.out.println("Fare: ₹" + fare);
    }
}

