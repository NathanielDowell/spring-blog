package com.codeup.springblog.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;


    @OneToMany(mappedBy = "author")
    private List<Post> posts;

    public User() {
    }

    public User(User copy) { //This is our copy constructor, which copies user attributes for use with other objects
        id = copy.id;
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}