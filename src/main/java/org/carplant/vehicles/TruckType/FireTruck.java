package org.carplant.vehicles.TruckType;

import org.carplant.vehicles.Truck;

import java.util.UUID;

public class FireTruck extends Truck {

    private int litresOfWaterTank;

    public FireTruck() {
    }

    @Override
    public String toString() {
        return "FireTruck{" +
                "litresOfWaterTank=" + litresOfWaterTank +
                "} " + super.toString();
    }

    public FireTruck(UUID id, String color, float weight, int numberOfDoors, String fuelType, int litresOfWaterTank) {
        this.setId(id);
        this.setColor(color);
        this.setWeight(weight);
        this.setNumberOfDoors(numberOfDoors);
        this.setFuelType(fuelType);
        this.litresOfWaterTank = litresOfWaterTank;
    }

    public int getLitresOfWaterTank() {
        return litresOfWaterTank;
    }

    public void setLitresOfWaterTank(int litresOfWaterTank) {
        this.litresOfWaterTank = litresOfWaterTank;
    }


    public void specialMakeSignal() {
        System.out.println("Truck id is: " + "FRTRCK" + getId() + " And, It's a  Fire Truck and it can make SPECIAL signal");
    }

    public void outTheFire(int id) {
        System.out.println("Truck id is : " + id + ", I can put out the fire");
    }

    @Override
    public void drive() {
        System.out.println("It's a Fire Truck, and it can be drive");
    }

}
