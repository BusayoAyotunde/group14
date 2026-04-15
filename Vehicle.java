package outdrive.model;

public class Vehicle{  //fields
    private String id;
    private String name;
    private double price;
    private boolean isAvailable;

public Vehicle( String id, String name, double price, boolean isAvailable){   //constructor
    this.id = id;
    this.name = name;
    this.price = price;
    this.isAvailable= isAvailable;

}
//getters:
public String getId(){
    return id;
}

public String getName(){
    return name;
}

public double getPrice(){
    return price;
}
public boolean isAvailable() {
    return isAvailable;
    }

//setters:
 public void setId(String id) {
    this.id = id; 
}

public void setName(String name) {
    this.name = name; 
}

  public void setPrice(double price) { 
    this.price = price; 
}

public void setIsAvailable(boolean available){
    isAvailable = available;
}


 public double calculateRentalCost(int days) {  //method to calculate charge of renting vehicles
        return price * days;
 }
}