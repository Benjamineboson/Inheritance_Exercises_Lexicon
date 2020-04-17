package org.example.exerciseOne.model;

public abstract class Vehicle {
    private int vehicleId;
    private String brand;
    private String regNum;

    public Vehicle(int vehicleId, String brand, String regNum) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.regNum = regNum;
    }

    public abstract void drive();
}
