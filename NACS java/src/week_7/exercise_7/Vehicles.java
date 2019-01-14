package week_7.exercise_7;

import java.util.Arrays;
import java.util.List;

public class Vehicles {
    private static List<Vehicle> vehicles = Arrays.asList(new VehicleType1(),new VehicleType5());


    public static List<Vehicle> getVehicles() {
        return vehicles;
    }
}
