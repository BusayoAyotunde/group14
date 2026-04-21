package outdrive.app;

import java.util.Scanner;
import outdrive.model.User;
import outdrive.service.VehicleService;
import outdrive.service.RentalService;

public class UserMenu {

    public static void  userMenu(
    Scanner scanner,
    User user,
    VehicleService vehicleService,
    RentalService rentalService) {


        while(true) {
            System.out.println("\n===== OUTDRIVE USER MENU =====");
            System.out.println("WELCOME " + user.getName());
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

            switch  (choice) {

                case 1:
                    vehicleService.viewAvailable();
                    break;

                    case 2:
                        rentalService.rentVehicle(user, scanner);
                        break;

                        case 3:
                            rentalService.returnVehicle(scanner);
                            break;

                            case 4:
                                rentalService.viewHistory(user);
                                break;

                                case 5:
                                    return;

                                    default:
                                        System.out.println("Invalid input. Choose 1-5.");
            }
        }
    }
}
