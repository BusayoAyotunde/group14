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
        double cost = super.calculateRentalCost(days);

        if (isElectric){
            cost *= 1.2;
        }
        return cost;
    }
}