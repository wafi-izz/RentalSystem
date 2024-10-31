public class Main {
    public static void main(String[] args) {
        RentalSystem rs = new RentalSystem();
        rs.getTopRentals();
        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu();
    }
}


/*
* You are tasked with designing a vehicle rental system.
* The system has to manage different types of vehicles (cars, trucks and motorcycles).
* It also needs to save information about customers who rent these vehicles.

vehicle.Vehicle information:

license plate
colour
price per day

customer.Customer information:

Name
Address
Age

When designing this system, have in mind the features that the users will need:

check if the vehicle is currently free or rented out
calculate total rental price for the customer
get a list of max last 5 rentals per vehicle
* */