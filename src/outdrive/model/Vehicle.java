package outdrive.model;

public abstract class Vehicle {

    private String id;
    private String name;
    private double price;
    private boolean isAvailable;

    public Vehicle(String id, String name, double price, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getDetails() {
        return id + " | " + name + " | P" + price +
                " | " + (isAvailable ? "Available" : "Not  Available");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsAvailable(boolean available) {
        this.isAvailable = available;
    }

    public double calculateRentalCost(int days) {
        if(days <= 0) {
            throw new IllegalArgumentException("Days must be greater than 0");
        }
        return price * days;
    }
}