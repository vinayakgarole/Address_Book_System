package com.bridgelabz;

public class Contacts {

    public String firstName, lastName, address, city, state, email, phoneNumber;
    public int zip;
    public Contacts(String firstName, String lastName, String address, String city, String state, String email, int zip, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhoneNo() {
        return phoneNumber;
    }

    public void setPhoneNo(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts { " +
                "firstName = " + firstName + "\n" +
                ", lastName = " + lastName + "\n" +
                ", address = " + address + "\n" +
                ", city = " + city + "\n" +
                ", state = " + state + "\n" +
                ", email = " + email + "\n" +
                ", phoneNumber = " + phoneNumber + "\n" +
                ", zip = " + zip +
                '}';
    }
}

