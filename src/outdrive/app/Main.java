package outdrive.app;

import java.util.Scanner;
import outdrive.service.*;
import outdrive.model.*;
import outdrive.app.UserMenu;

public class Main {

    public static void main(String [] args) {

        Scanner  scanner = new Scanner(System.in);

        UserService userService = new UserService();
        VehicleService vehicleService = new VehicleService();
        RentalService rentalService = new RentalService();

        while (true) {

            System.out.println("\n===== OUTDRIVE SYSTEM =====");
            System.out.println("1. Register User");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice;

        while (true) {
             System.out.print("Enter option: ");

         if (scanner.hasNextInt()) {
             choice = scanner.nextInt();
              scanner.nextLine();
             break;
         } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
      }
}

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Phone: ");
                        String phone = scanner.nextLine();

                        System.out.print("Password: ");
                     String regPassword = scanner.nextLine();

                        userService.addUser(name, phone, regPassword); 
                        
                        break;

                    case 2:
                        System.out.print("ID: ");
                        String id = scanner.nextLine();

                        System.out.print("Password: ");
                        String password = scanner.nextLine();

                        User user = userService.login(id, password);

                        if (user != null) {
                            UserMenu.userMenu(scanner,user,vehicleService,rentalService);
                        } else {
                            System.out.println("Login failed. Try Again.");
                        }
                        break;

                        case 3:
                            System.out.println("Exiting system...");
                            scanner.close();
                            return;

                            default:
                                System.out.println("Invalid option.");

                                
            }

        }
    }
}
