package outdrive.service;

import outdrive.model.Vehicle;
import java.util.ArrayList;

public class VehicleService {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("Vehicle added successfully.");
    }

    public void showAvailable() {
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