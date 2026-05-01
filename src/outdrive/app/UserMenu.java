package outdrive.app;

import java.util.Scanner;
import outdrive.model.User;
import outdrive.model.Vehicle;
import outdrive.service.VehicleService;
import outdrive.service.RentalService;

public class UserMenu {

    public static void userMenu(
            Scanner scanner,
            User user,
            VehicleService vehicleService,
            RentalService rentalService) {

        while (true) {
            System.out.println("\n===== OUTDRIVE USER MENU =====");
            System.out.println("WELCOME " + user.getName());
            System.out.println("================================");
            System.out.println("1. View Available Vehicles");
            System.out.println("2. Rent Vehicle");
            System.out.println("3. Return Vehicle");
            System.out.println("4. View Rental History");
            System.out.println("5. Logout");

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
                    vehicleService.showAvailable();
                    break;

                case 2:
                    vehicleService.showAvailable();

                    System.out.print("Enter vehicle ID: ");
                    String id = scanner.nextLine();

                    Vehicle vehicle = vehicleService.findById(id);

                    if (vehicle == null) {
                        System.out.println("Vehicle not found.");
                        break;
                    }

                    System.out.print("Start date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();

                    System.out.print("Days: ");
                    int days = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        rentalService.rentVehicle(user, vehicle, date, days);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                     System.out.print("Enter rental ID: ");
                     String rentalId = scanner.nextLine();
                     rentalService.returnVehicle(rentalId);
                   break;

                case 4:
                    rentalService.viewMyHistory(user);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid input. Choose 1-5.");
            }
        }
    }
}