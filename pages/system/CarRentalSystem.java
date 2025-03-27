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
    public boolean adminLogin(String id, String password) {
        return admin.login(id, password);
    }

    // ! add car
    public void addCar(Car car) {
        carList.add(car);
        System.out.println("Car added successfully");
    }

    // ! remove car
    public void removeCar(String carId) {
        boolean removed = carList.removeIf(car -> car.getId().equals(carId));
        if (removed) {
            System.out.println("Car removed successfully");
        } else {
            System.out.println("Car not found");
        }
    }

    // ! view all booking
    public void viewAllBooking() {
        if (reservations.isEmpty()) {
            System.out.println("No booking found");
        } else {
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }
    // ! update car info

    // customer
    // ! search ava cars
    public void searchAvailableCars() {
        boolean found = false;
        for (Car car : carList) {
            if (car.status()) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available cars found");
        }
    }

    // ! book car
    public boolean bookCar(String carId, Customer customer) {
        // specail case //
        if (carList.isEmpty())
            return false;
        // -----Logic-----//
        for (Car car : carList) {
            if (car.getId().equals(carId) && car.status()) {
                car.setAvailable(false);
                Reservation res = new Reservation(customer, car);
                reservations.add(res);
                customers.add(customer);
                System.out.println("Car booked successfully");
                return true;
            }
        }
        System.out.println("Car not found or not available");
        return false;
    }
    // ! cancel booking

    // --load/ save data
    // ! load cars
    // ! load customers
    // ! load reservations
    // ! getCar list
    // ! getCustomers
    // ! getReservations

}
