package system;

import java.util.ArrayList;
import java.util.List;

import car.Car;
import customer.Customer;
import customer.Reservation;
import login.Admin;

public class CarRentalSystem {
    private ArrayList<Car> carList = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();
    private Admin admin;
    // constructor

    public CarRentalSystem(Admin admin) {
        this.admin = admin;
    }
    // admin features
    // ! admin login
    // ! add car
    // ! remove car
    // ! view all booking
    // ! update car info

    // customer
    // ! search ava cars
    // ! bookcar
    // ! cancel booking

    // --load/ save data
    // ! load cars
    // ! load customers
    // ! load reservations
    // ! getCar list
    // ! getCustomers
    // ! getReservations

}
