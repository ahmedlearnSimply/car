package customer;

import java.io.Serializable;

public class Customer implements Serializable {
    private String fullName;
    private int id;
    private String phone;

    // Constructor
    public Customer(String fullName, int id, String phone) {
        this.fullName = fullName;
        this.id = id;
        this.phone = phone;
    }

    // Setters
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public int getID() {
        return id;
    }

    public String toString() {
        return "Name: " + fullName + " - " +
                "ID: " + id + " - " + "Phone: " + phone;
    }
}
