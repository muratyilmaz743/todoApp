package net.guides.springboot.todomanagement.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long user_id;

    private String username;

    private String password;

    private boolean enabled;

    private String role;

    public User() {
        super();
    }

    public User(String name,String password, String role) {
        super();
        this.username = name;
        this.password = password;
        this.role = role;

    }


    public long getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
