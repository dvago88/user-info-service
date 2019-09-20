package com.globant.userinfoservice.model;

public class User {

    private int userId;
    private String Name;
    private String identification;
    private String phone;

    public User() {
        super();
    }

    public User(int userId, String name, String identification, String phone) {
        this.userId = userId;
        Name = name;
        this.identification = identification;
        this.phone = phone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
