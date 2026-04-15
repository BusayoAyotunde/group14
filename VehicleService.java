package service;

import model.Vehicle;
import java.util.ArrayList;

public class VehicleService {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("Vehicle added successfully.");
    }

    public void showAvailable() {
        boolean found = false;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).isAvailable()) {
                System.out.println(vehicles.get(i).getDetails());
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
        } else {
            for (int i = 0; i < vehicles.size(); i++) {
                System.out.println(vehicles.get(i).getDetails());
            }
        }
    }

    public Vehicle findByPlate(String plate) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getPlateNumber().equalsIgnoreCase(plate)) {
                return vehicles.get(i);
            }
        }
        return null;
    }
}
