package org.example.exerciseOne.model;

public class Car extends Vehicle {

    private int numOfDoors;
    private int numOfPassengers;

    public Car(int vehicleId, String brand, String regNum, int numOfDoors, int numOfPassengers) {
        super(vehicleId, brand, regNum);
        this.numOfDoors = numOfDoors;
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}
