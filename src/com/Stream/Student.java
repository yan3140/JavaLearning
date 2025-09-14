package com.Stream;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Address> address;
    public Student(){}
    public Student(String name, int age, List<Address> address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public  List<Address> getAddress() {
        return address;
    }
    public void setAddress(List<Address> address) {
        this.address = address;
    }
    public void findAddress(Address a1){

            System.out.println(a1.getCity() + "," + a1.getStreet() + "," + a1.getDoorID() + "号");

    }

}
