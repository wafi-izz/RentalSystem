import customer.Customer;
import rental.Rental;
import vehicle.Vehicle;

import java.util.Scanner;

public class MainMenu {
    Scanner sc = new Scanner(System.in);
    RentalSystem rentalSystem = new RentalSystem();
    public void mainMenu() {
        while (true) {
            printMainMenu();
            System.out.print("Enter your Option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addCustoemr();
                    break;
                case 2:
                    addVehicle();
                    break;
                case 3:
                    viewCustomers();
                    break;
                case 4:
                    viewVehicles();
                    break;
                case 5:
                    rentVehicle();
                    break;
                case 6:
                    viewRentals();
                    break;
                case 7:
                    viewTopFive();
                    break;
                case 8:
                    checkRentSatus();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid Option");
            }

        }
    }

    private void printMainMenu() {
        System.out.println();
        System.out.println("Main Menu");
        System.out.println("------------");
        System.out.println();
        System.out.println("1 - add customer");
        System.out.println("2 - add vehicle");
        System.out.println("3 - view customers");
        System.out.println("4 - view vehicles");
        System.out.println("5 - rent a car");
        System.out.println("6 - View rentals");
        System.out.println("7 - View the Top 5");
        System.out.println("8 - check if is rented");
        System.out.println("9 - exit");
        System.out.println();
    }

    private void addCustoemr() {
        System.out.println();
        System.out.println("====================");

        System.out.print("input Customer Name: ");
        String customerName = sc.nextLine();
        sc.nextLine();
        System.out.print("input Customer address: ");
        String customerAddress = sc.nextLine();
        System.out.print("input Customer age: ");
        int customerAge = sc.nextInt();

        rentalSystem.addCustomer(new Customer(customerName,customerAddress,customerAge));

        System.out.println("====================");
        System.out.println();
    }
    private void addVehicle() {
        System.out.println();
        System.out.println("====================");

        System.out.print("input plate number: ");
        String plateNumber = sc.nextLine();
        sc.nextLine();
        System.out.print("input colour: ");
        String colour = sc.nextLine();
        System.out.print("input price per day: ");
        double pricePerDay = sc.nextDouble();

        rentalSystem.addVehicle(new Vehicle(plateNumber,colour,pricePerDay));

        System.out.println("====================");
        System.out.println();
    }

    private void viewCustomers() {
        System.out.println();
        System.out.println("====================");

        rentalSystem.printCustomers();

        System.out.println("====================");
        System.out.println();
    }

    private void viewVehicles() {
        System.out.println();
        System.out.println("====================");

        rentalSystem.printVehicles();

        System.out.println("====================");
        System.out.println();
    }

    private void rentVehicle() {
        System.out.println();
        System.out.println("====================");

        rentalSystem.printCustomers();
        System.out.println();
        System.out.print("enter customer Number: ");
        int customerNumber = sc.nextInt();
        rentalSystem.printVehicles();
        System.out.print("enter vehicle number: ");
        int vehicleNumber = sc.nextInt();
        System.out.print("enter number of days: ");
        int numberOfDays = sc.nextInt();
        Customer customer = rentalSystem.getCustomers().get(customerNumber-1);
        Vehicle vehicle = rentalSystem.getVehicles().get(vehicleNumber-1);
        rentalSystem.addRental(new Rental(customer,vehicle,numberOfDays,numberOfDays * vehicle.getPricePerDay()));

        System.out.println("====================");
        System.out.println();
    }

    private void viewRentals() {
        System.out.println();
        System.out.println("====================");

        rentalSystem.printRentals();

        System.out.println("====================");
        System.out.println();
    }
    private void viewTopFive() {
        System.out.println();
        System.out.println("====================");

        rentalSystem.getTopRentals();

        System.out.println("====================");
        System.out.println();
    }
}
