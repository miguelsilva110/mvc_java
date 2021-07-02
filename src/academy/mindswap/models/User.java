package academy.mindswap.models;

import academy.mindswap.service.UserService;

// POJO - Plain Old Java Object
public class User {

    private int id;
    private String username;
    private String email;
    private String password;

    public User(String username, int id, String email, String password) {
        this.username = username;
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
