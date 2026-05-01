package outdrive.service;

import outdrive.model.Rental;
import outdrive.model.User;
import outdrive.model.Vehicle;
import outdrive.exceptions.VehicleNotAvailableException;
import java.util.ArrayList;

public class RentalService {
    private ArrayList<Rental> rentals = new ArrayList<>();

    public void rentVehicle(User user, Vehicle vehicle, String startDate, int days) throws VehicleNotAvailableException {
        if (!vehicle.isAvailable()) {
            throw new VehicleNotAvailableException(vehicle.getId());
        }
        Rental rental = new Rental(user, vehicle, startDate, days);
        rentals.add(rental);
        System.out.println("Rental successful!");
        System.out.println(rental);
    }

    public void viewMyHistory(User currentUser) {
        boolean found = false;
        for (Rental r : rentals) {
            if (r.getUser().getUserId().equals(currentUser.getUserId())) {
                System.out.println(r);
                found = true;
            }
        }
        if (!found) {
            System.out.println("You have no rentals yet.");
        }
    }

    public void listAllRentals() {
        if (rentals.isEmpty()) {
            System.out.println("No rentals found.");
            return;
        }
        for (Rental r : rentals) {
            System.out.println(r);
        }
    }

    public void returnVehicle(String rentalId) {
        for (Rental r : rentals) {
            if (r.getRentalId().equalsIgnoreCase(rentalId)) {

                r.setStatus("RETURNED");
                r.getVehicle().setIsAvailable(true);

                System.out.println("vehicle returned successfully.");
                return;
            }
        }

        System.out.println("Rental not found");
    }

    public void printSummary() {
        System.out.println("\n-- Rental Summary --");
        System.out.println("Total rentals: " + rentals.size());
        double total = 0;
        for (Rental r : rentals) {
            total += r.getTotalCost();
        }
        System.out.println("Total revenue: P" + String.format("%.2f", total));
    }
}
