package outdrive.model;

import java.time.LocalDate;

public class Rental {

    
    private String rentalId;
    private User user;
    private Vehicle vehicle;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private double totalCost;
    private String status;

    // Constructor: initializes a Rental object with all required details
    public Rental(User user, Vehicle vehicle, String startDate, int days) {
    this.user = user;
    this.vehicle = vehicle;

    this.rentalId = "R" + System.currentTimeMillis();

    this.rentalDate = LocalDate.parse(startDate);
    this.returnDate = rentalDate.plusDays(days);

    this.totalCost = vehicle.calculateRentalCost(days);

    this.status = "ACTIVE";
}
    

    // Getter for rental ID
    public String getRentalId() {
        return rentalId;
    }

    // Getter for user
    public User getUser() {
        return user;
    }

    // Getter for vehicle
    public Vehicle getVehicle() {
        return vehicle;
    }

    // Getter for rental start date
    public LocalDate getRentalDate() {
        return rentalDate;
    }

    // Getter for return date
    public LocalDate getReturnDate() {
        return returnDate;
    }

    // Getter for total cost
    public double getTotalCost() {
        return totalCost;
    }

    // Getter for rental status
    public String getStatus() {
        return status;
    }

    // Setter for rental status (allows updating status)
    public void setStatus(String status) {
        this.status = status;
    }

    // Method to display rental details in a readable format
    public void displayInfo() {
        System.out.println(
            "Rental ID: " + rentalId +
            ", Customer: " + user.getName() +
            ", Vehicle: " + vehicle.getName() +
            ", Cost: P" + totalCost +
            ", Status: " + status
        );
    }
}

