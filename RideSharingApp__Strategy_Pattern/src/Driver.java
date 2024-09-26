public class Driver extends User {
    private String vehicleType;
    private boolean isAvailable;

    public Driver(int id, String name, String location, String vehicleType) {
        super(id, name, location);
        this.vehicleType = vehicleType;
        this.isAvailable = true;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void acceptRide(Trip trip) {
        if (isAvailable) {
            trip.assignDriver(this);
            System.out.println(name + " has accepted the ride.");
        }
    }

    public void startTrip(Trip trip) {
        trip.startTrip();
    }

    public void completeTrip(Trip trip) {
        trip.completeTrip();
    }

    public void updateRating(double rating) {
        this.rating = (this.rating + rating) / 2; // Assuming `rating` is inherited from User
    }

    public void rateRider(Rider rider, double rating) {
        System.out.println(name + " rated " + rider.getName() + " with " + rating + " stars.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver: " + name + ", Vehicle Type: " + vehicleType + ", Location: " + location + ", Rating: " + rating);
    }
}

