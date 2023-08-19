package org.carplant.vehicles.TruckType;

import org.carplant.vehicles.Truck;

import java.util.UUID;

public class CraneTruck extends Truck {

    public CraneTruck() {
    }

    public CraneTruck(UUID id, String color, float weight, int numberOfDoors, String fuelType) {
        this.setId(id);
        this.setColor(color);
        this.setWeight(weight);
        this.setNumberOfDoors(numberOfDoors);
        this.setFuelType(fuelType);
    }
}
