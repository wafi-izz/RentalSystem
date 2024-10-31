import customer.Customer;
import rental.Rental;
import vehicle.Vehicle;

import java.util.*;

public class RentalSystem {
    ArrayList<Vehicle> vehicles;
    ArrayList<Customer> customers;
    ArrayList<Rental> rentals;
    public RentalSystem() {
        vehicles = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void addRental(Rental rental) {
        rentals.add(rental);
    }
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public void printVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
    public void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    public void printRentals() {
        for (Rental rental : rentals) {
            System.out.println(rental);
        }
    }
    public void getTopRentals() {
        double[] sortedValues = new double[rentals.size()];
        ArrayList<Rental> topRentals = new ArrayList<>();
        Set g = new TreeSet();
        for (Rental r : rentals) {
            g.add(r);
        }
        System.out.println(g);
//        for (int i = 0; i < rentals.size(); i++) {
//            sortedValues[i] = rentals.get(i).getDays() * rentals.get(i).getPriceThatDay();
//        }
//        sortedValues = Arrays.stream(sortedValues).sorted().toArray();
//        for (int i = 4; i <= 0; i++) {
//            System.out.println(rentals.get(sortedValues[i]));
//        }
    }
}



/*
 * You are tasked with designing a vehicle rental system.
 * The system has to manage different types of vehicles (cars, trucks and motorcycles).
 * It also needs to save information about customers who rent these vehicles.

 * When designing this system, have in mind the features that the users will need:

check if the vehicle is currently free or rented out
calculate total rental price for the customer
get a list of max last 5 rentals per vehicle
* */