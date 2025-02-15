package com.example.mobileappfinalproject;

public class UserAccount {
    private String email;
    private String password;
    public UserAccount() {}
    public UserAccount(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}

