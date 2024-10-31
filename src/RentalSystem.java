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
        int i=1;
        for (Vehicle vehicle : vehicles) {
            System.out.println(i +  " - " + vehicle);
            i++;
        }
    }
    public void printCustomers() {
        int i=1;
        for (Customer customer : customers) {
            System.out.println(i +  " - " + customer);
            i++;
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
        Set<Double> g = new TreeSet<>();
        int i=0;
        for (Rental r : rentals) {
            g.add(r.getDays() * r.getPriceThatDay());
            i++;
        }

//        for (Map.Entry<Double, Integer> entry : g.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
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