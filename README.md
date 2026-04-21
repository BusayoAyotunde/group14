# group14 - Transport Rental System

Group members;
1. Busayo Ayotunde
2. Evermore k. Chieza
3. Baone O. Kantini
4. Laone N.Lesame
5. Tafadzwa Magweregwede 

Description: 
Java console project that allows users to rent, return and manage preffered vehicles.

Milestone1:

Class list:
- Vehicle(parent) 
- Car (extens Vehicle)
- Bicycle (extends Vehicle)
- Motorcycle (extends Vehicle)
- User
- Rental
- VehicleService
- UserService
- RentalService
- Main - for the menu

Package structure:
src/outdrive/app
src/outdrive/model
src/outdrive/service

Progress:
- created the project structure
- updated Vehicle and Car classes
- updated Bicycle and Motorcycle classes

Milestone2(each member should write what they did in milestone 2)
- added fields, getters and setters to Vehicle and Car classes
- created the project structure
- developed Main.java
- implemented the user interaction menu (UserMenu)
- .........

Milestone3(each memebr should write what they did in mlestone 3)
- Updated Vehicle and Car classes and fixed errors
- Updated Vehicle class to abstract
- Updated Rental cost method in Vehicle class to abstract
- Updated rental cost method in Car class to support abstract class in parent class
- Seccessfully tested the Vehicle and Car classes on a temporary code. Results:
Toyota
500.0
1100.0
- UserMenu.java improvements:
- added input buffer using scanner.nextLine() after reading numeric input to prevent input skipping issues
- improved user interface formatting by updating system headers
- updated menu display by separating system title and user welcome message for better readability
- refactored console output to improve clarity and consistency in user navigation
