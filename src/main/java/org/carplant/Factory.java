package org.carplant;

import org.carplant.vehicles.TruckType.FireTruck;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Factory {

    public List<FireTruck> fireTrucks = new ArrayList<>();

    public void createFireTruck() {
        FireTruck fireTruck = new FireTruck(UUID.randomUUID(), "Red", 3, 4, "Diesel", 1800);
        System.out.println("Fire Truck created and Fire truck chassis no is :" + "FRTRCK" + fireTruck.getId());
        fireTruck.start();
        fireTruck.drive();
        fireTruck.specialMakeSignal();
        fireTruck.toString();
        fireTrucks.add(fireTruck);
        System.out.println("Fire Truck" + fireTruck.getId() + "is ready for use");

        System.out.println("--------------------------------------------------------------------");

        FireTruck fireTruck2 = new FireTruck(UUID.randomUUID(), "Red", 3, 4, "Diesel", 1800);
        System.out.println("Fire Truck created and Fire truck chassis no is :" + "FRTRCK" + fireTruck.getId());
        fireTruck2.start();
        fireTruck2.drive();
        fireTruck2.specialMakeSignal();
        fireTruck2.toString();
        fireTrucks.add(fireTruck2);
        System.out.println("Fire Truck" + fireTruck2.getId() + "is ready for use");

        System.out.println("--------------------------------------------------------------------");

        FireTruck fireTruck3 = new FireTruck(UUID.randomUUID(), "Red", 3, 4, "Diesel", 1800);
        System.out.println("Fire Truck created and Fire truck chassis no is :" + "FRTRCK" + fireTruck.getId());
        fireTruck3.start();
        fireTruck3.drive();
        fireTruck3.specialMakeSignal();
        fireTruck3.toString();
        fireTrucks.add(fireTruck3);
        System.out.println("Fire Truck" + fireTruck3.getId() + "is ready for use");

    }

}
