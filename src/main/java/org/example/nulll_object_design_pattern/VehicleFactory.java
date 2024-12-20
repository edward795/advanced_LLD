package org.example.nulll_object_design_pattern;

public class VehicleFactory {
    static Vehicle getVehicleObject(String typeOfVehicle){
        if("Car".equals(typeOfVehicle)){
            return new Car();
        }
        return new NullVehicle();
    }
}
