package outdrive.service;

import outdrive.model.Vehicle;
import outdrive.model.Car;
import outdrive.model.Motorcycle;
import outdrive.model.Bicycle;
import java.util.ArrayList;

public class VehicleService {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public VehicleService() {
        vehicles.add(new Car("C1", "Toyota Quest", 500.0, true, "Automatic"));
        vehicles.add(new Car("C2", "Toyota Hilux", 1100.0, true, "Manual"));

        vehicles.add(new Motorcycle("M1", "Yamaha R15", 300.0, true, "150cc"));
        vehicles.add(new Bicycle("B1", "Mountain Bike", 100.0, true, false));
    } 

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("Vehicle added successfully.");
    }

    public void viewAvailable() {
        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                System.out.println(v.getDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry, no vehicles are available at the moment.");
        }
    }

    public void showAll() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the system yet.");
            return;
        }

        for (Vehicle v : vehicles) {
            System.out.println(v.getDetails());
        }
    }

    public Vehicle findById(String id) {
        for (Vehicle v : vehicles) {
            if (v.getId().equalsIgnoreCase(id)) {
                return v;
            }
        }
        return null;
    }
}