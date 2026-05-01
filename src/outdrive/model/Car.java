package outdrive.model;

public class Car extends Vehicle {   // automatic or manual field for Car
    private String transmissionType;


// constructor
    public Car( String id, String name, double price, boolean isAvailable, String transmissionType) {
         super(id, name, price, isAvailable); // call Vehicle constructor
        
         this.transmissionType = transmissionType;
    }

//getters
 public String getTransmissionType() {
        return transmissionType;
    }

//setters
 public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
 @Override
    public double calculateRentalCost(int days) {    // override method to calculate the charge of renting a Car
        return super.calculateRentalCost(days) * 1.10;
    }
}
