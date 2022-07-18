package com.codegym.model;

import java.util.List;

public class Person {
    private int id;
    private String name;
    private String birth;
    private String vehicle;
    private String departureDate;
    private String endDate;
    private String country;

    public Person() {
    }

    public Person(int id, String name, String birth, String vehicle, String departureDate, String endDate, String country) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.vehicle = vehicle;
        this.departureDate = departureDate;
        this.endDate = endDate;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addAttribute(String person, List<Person> personList) {
    }
}
