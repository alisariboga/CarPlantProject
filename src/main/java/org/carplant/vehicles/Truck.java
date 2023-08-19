package org.carplant.vehicles;

import org.carplant.Vehicle;

import java.util.UUID;

public class Truck extends Vehicle {
    public Truck() {
    }

    public Truck(UUID id, String color, float weight, int numberOfDoors, String fuelType) {
        super(id, color, weight, numberOfDoors, fuelType);
    }
}
