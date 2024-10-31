package vehicle;

public class Vehicle{
    String licensePlate;
    String colour;
    double pricePerDay;
    boolean isRented;
    public Vehicle(String licensePlate, String colour, double pricePerDay){
        this.licensePlate = licensePlate;
        this.colour = colour;
        this.pricePerDay = pricePerDay;
        this.isRented = false;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    public void isRented() {
        this.isRented = true;
    }
    @Override
    public String toString(){
        return "LicensePlate: " + licensePlate + ", Colour: " + colour + ", Price: " + pricePerDay;
    }
}
