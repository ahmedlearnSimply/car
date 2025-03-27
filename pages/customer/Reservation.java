package customer;
import java.io.Serializable;

import car.Car;

public class Reservation implements Serializable{
    private Customer customer;
    private Car car;

    public Reservation(Customer customer, Car car) {
        this.customer = customer;
        this.car = car;
    }

    public int getCustomerID() {
        return customer.getID();
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Reservation: " + car + " | Customer: " + customer.getID();
    }
}
