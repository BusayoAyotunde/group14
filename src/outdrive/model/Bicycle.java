package outdrive.model;

public class Bicycle extends Vehicle {

    private boolean isElectric;

    // constructor
    public Bicycle(String id, String name, double price, boolean isAvailable, boolean isElectric) {
        super(id, name, price, isAvailable);
        this.isElectric = isElectric;
    }

    // getters
    public Boolean isElectric() {
        return isElectric;
    }

    // setters
    public void setElectric(Boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (isElectric){
            return super.calculateRentalCost(days) + 20; // extra charge for electric bike
        }
        return super.calculateRentalCost(days);
    }
}