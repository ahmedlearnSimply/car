package car;

import java.io.Serializable;

public class Car implements Serializable {
    private String id;
    private String brand;
    private String model;
    private boolean status; // Shows if the car is available or not

    public Car(String id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.status = true; // By default, the car is available
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean status() {
        return status;
    }

    public void setAvailable(boolean available) {
        status = available;
    }

    public String toString() {
        return id + " - " + brand + " " + model + (status ? " (Available)" : " (Reserved)");
    }
}
