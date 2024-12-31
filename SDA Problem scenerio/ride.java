import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class RideRequest {
    private String passengerName;
    private String pickupLocation;
    private String dropoffLocation;

    public RideRequest(String passengerName, String pickupLocation, String dropoffLocation) {
        this.passengerName = passengerName;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }
}

class Driver {
    private String driverName;
    private String currentLocation;

    public Driver(String driverName, String currentLocation) {
        this.driverName = driverName;
        this.currentLocation = currentLocation;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }
}

class RideMatchingService {
    private BlockingQueue<RideRequest> rideRequestsQueue = new LinkedBlockingQueue<>();

    public void receiveRideRequest(RideRequest request) {
        try {
            rideRequestsQueue.put(request);
            System.out.println("Received ride request from " + request.getPassengerName());
        } catch (InterruptedException e) {
            System.err.println("Error adding ride request to the queue: " + e.getMessage());
        }
    }

    public void assignDriver(Driver driver) {
        new Thread(() -> {
            while (true) {
                try {
                    RideRequest request = rideRequestsQueue.take(); // Process one request at a time
                    System.out.println("Assigning driver " + driver.getDriverName() +
                            " to passenger " + request.getPassengerName() +
                            " (Pickup: " + request.getPickupLocation() + ", Dropoff: " + request.getDropoffLocation() + ")");
                } catch (InterruptedException e) {
                    System.err.println("Error processing ride request: " + e.getMessage());
                }
            }
        }).start();
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        RideMatchingService service = new RideMatchingService();

        // Simulate drivers
        Driver driver1 = new Driver("Alice", "Downtown");
        Driver driver2 = new Driver("Bob", "Uptown");

        // Assign drivers to the service
        service.assignDriver(driver1);
        service.assignDriver(driver2);

        // Simulate ride requests
        service.receiveRideRequest(new RideRequest("John", "Main Street", "Park Avenue"));
        service.receiveRideRequest(new RideRequest("Jane", "Central Plaza", "Market Square"));
        service.receiveRideRequest(new RideRequest("Mike", "Broadway", "Fifth Avenue"));
    }
}
