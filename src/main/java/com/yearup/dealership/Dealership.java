package com.yearup.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public List<Vehicle> getVehiclesByPrice;
    public List<Vehicle> getVehiclesByMakeModel;
    public List<Vehicle> getVehiclesByYear;
}
