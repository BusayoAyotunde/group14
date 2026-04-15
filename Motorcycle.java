package outdrive.model;

public class Motorcycle extends Vehicle {

    private String motorcycleCategory;

    // constructor
    public Motorcycle(String id, String name, double price, boolean isAvailable, String motorcycleCategory) {
        super(id, name, price, isAvailable);
        String motorcycleCategory
    }

    // getters
    public String getMotorcycleCategory() {
        return motorcycleCategory;
    }

    // setters
    public void setMotorcycleCategory(String motorcycleCategory) {
        this.motorcycleCategory = motorcycleCategory;
    }

    @Override
    public double calculateRentalCost(int days) {
        return super.calculateRentalCost(days) + 50;
    }
}