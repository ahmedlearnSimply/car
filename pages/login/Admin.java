package login;

import java.io.Serializable;

public class Admin implements Serializable {
    private String id;
    private String password;

    public Admin() {

    }

    public Admin(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public boolean login(String id, String password) {
        return this.id.equals(id) && this.password.equals(password);
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
