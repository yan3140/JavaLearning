package com.Stream;

import java.util.Objects;

public class Address {
    private String doorID ;
    private String city;
    private String street;
    public Address(){}
    public Address(String doorID, String city, String street) {
        this.doorID = doorID;
        this.city = city;
        this.street = street;
    }
    public String getDoorID() {
        return doorID;
    }
    public void setDoorID(String doorID) {
        this.doorID = doorID;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;
        return Objects.equals(doorID, address.doorID) && Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(doorID);
        result = 31 * result + Objects.hashCode(city);
        result = 31 * result + Objects.hashCode(street);
        return result;
    }
}
