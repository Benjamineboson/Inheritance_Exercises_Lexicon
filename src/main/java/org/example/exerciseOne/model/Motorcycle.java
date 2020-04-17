package org.example.exerciseOne.model;

public class Motorcycle extends Vehicle {
    private String motorcycleType;

    public Motorcycle(int vehicleId, String brand, String regNum, String motorcycleType) {
        super(vehicleId, brand, regNum);
        this.motorcycleType = motorcycleType;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving...");
    }
}
