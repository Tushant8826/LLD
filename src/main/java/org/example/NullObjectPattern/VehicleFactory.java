package org.example.NullObjectPattern;

public class VehicleFactory {

    static Vehicle getVehicleObject(String vehicleType) {

        if(vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        }
        return new NullVehicle();
    }
}
