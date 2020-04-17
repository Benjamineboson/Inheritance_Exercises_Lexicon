package org.example.exerciseOne.model;

public class Truck extends Vehicle {
    private double maxWeight;
    private int maxSpeed;

    public Truck(int vehicleId, String brand, String regNum, double maxWeight, int maxSpeed){
        super(vehicleId,brand,regNum);
        this.maxWeight = maxWeight;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Truck is driving...");
    }
}
