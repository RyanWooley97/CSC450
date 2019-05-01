package com.hfad.inventoryappfinalproject;

public class Customers {

    private int id;
    private String username;
    private String zipcode;
    private String phone;
    private String email;

    public Customers(String username, String zipcode, String phone, String email) {
        this.username = username;
        this.zipcode = zipcode;
        this.phone = phone;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getZipcode() { return zipcode; }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNum() { return phone; }

    public void setPhoneNum(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
