package rental;

import customer.Customer;
import vehicle.Vehicle;

public class Rental {
    // a model class to save the rents that's happening
    Customer customer;
    Vehicle vehicle;
    int days;
    // to remember the price on the day of the rent
    double priceThatDay;
    public Rental(Customer customer, Vehicle vehicle, int days, double priceThatDay) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        this.priceThatDay = priceThatDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPriceThatDay() {
        return priceThatDay;
    }

    public void setPriceThatDay(double priceThatDay) {
        this.priceThatDay = priceThatDay;
    }

    @Override
    public String toString() {
        return "customer name: " + customer.getName() + ", address: " + customer.getAddress() + "\n" + "" +
                "\t" + "Vehicle plate: " + vehicle.getLicensePlate() + ",colour: " + vehicle.getColour() + "\n" + "" +
                "\t" + "number of days: " + days + ", price per day: " + priceThatDay + ", total: " + days*vehicle.getPricePerDay();
    }
}
