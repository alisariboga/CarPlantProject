package org.carplant;

import java.util.UUID;

public class Vehicle {
    private UUID id;
    private String color;
    private float weight;
    private int numberOfDoors;
    private String fuelType;


    public Vehicle() {
    }

    public Vehicle(UUID id, String color, float weight, int numberOfDoors, String fuelType) {
        this.id = id;
        this.color = color;
        this.weight = weight;
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", numberOfDoors=" + numberOfDoors +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    public void start(){
        System.out.println("Fire truck started");
    }

    public void drive(){

    }

    public void makeSignal(){

    }

    public void stop(){
        System.out.println("Fire truck stopped");
    }

}
