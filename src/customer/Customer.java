package customer;

public class Customer {
    String name;
    String Address;
    int Age;
    public Customer(String Name, String Address, int Age) {
        this.name = Name;
        this.Address = Address;
        this.Age = Age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    @Override
    public String toString() {
        return "Customer name=" + name + ", Address=" + Address + ", Age=" + Age;
    }
}
