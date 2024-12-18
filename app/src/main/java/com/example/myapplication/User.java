package com.example.myapplication;

public class User {
    private String email;
    private String password;

    // Konstruktor domyślny wymagany przez Firebase
    public User() {}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Gettery i Settery
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
