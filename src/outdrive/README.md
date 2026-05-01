OutDrive Vehicle Rental System – CSI142 Project

Project Overview

A console-based application that allows users to rent different modes of transport such as cars and bicycles. The system manages vehicle availability, calculates rental costs based on vehicle type and rental duration, and handles customer rentals and returns. This project system includes classes such as Vehicle, Car, User, and Rental. Inheritance is used to model different types of vehicles, while polymorphism will allow different vehicle types to implement rental-related behaviour in their own way. Encapsulation is used to protect data within classes, and collections manage groups of objects.

Features
· View available vehicles – Display all cars, bicycles, and motorbikes currently available for rent.
· Rent a vehicle – User selects a vehicle type, chooses a specific vehicle, enters rental duration (days), and confirms rental.
· Return a vehicle – Calculates total cost based on rates, marks the vehicle as available, and generates a simple receipt.
· Vehicle catalog – Preloaded with multiple vehicles of each type, each with model, rate, and availability status.
· Input validation – Handles invalid choices, unavailable vehicles, and users that dont qualify.

How to Compile and Run

1. Navigate to the project folder
```bash
 cd path/to/src
```
2. Compile all Java files
```bash
javac -d out src/outdrive/app/*.java src/outdrive/model/*.java src/outdrive/service/*.java src/outdrive/exceptions/*.java
```
3. Run the application
```bash
java -cp out outdrive.app.Main
```

Team Members 

· Member 1: Tafadzwa Magweregwede 202500607 - Main menu & system integration
· Member 2: Busayo Ayotunde 202203768 - Vehicle & Car classes
· Member 3:Baone O. Kantini 202404672 - Bicycle & Motorcycle classes
· Member 4: Evermore k. Chieza 202406567 - User & Rental classes
· Member 5: Laone N.Lesame 202501827 -Service classes

Class list:
- Vehicle(parent) 
- Car (extends Vehicle)
- Bicycle (extends Vehicle)
- Motorcycle (extends Vehicle)
- User
- Rental
- VehicleService
- UserService
- RentalService
- Main - for the menu
- VehicleNotAvailableException
- UserNotFoundException

Package structure:
src/outdrive/app
src/outdrive/model
src/outdrive/service
