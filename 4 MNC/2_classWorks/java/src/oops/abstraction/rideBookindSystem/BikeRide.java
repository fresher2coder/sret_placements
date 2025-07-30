package oops.abstraction.rideBookindSystem;

public class BikeRide extends Ride {

    public BikeRide(String customerName, float distance) {
        super(customerName, distance);
    }

    @Override
    void showRideType() {
        System.out.println("Ride Type: Bike");
    }

    @Override
    void calculateFare() {
        float fare = distance * 5.0f; // ₹5 per km
        System.out.println("Fare: ₹" + fare);
    }
}

