package week_7.exercise_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleType5Test {

    @Test
    void getVehicleType() {
        VehicleType5 vehicleType5 = new VehicleType5();
        Integer expected = 1;
Assertions.assertEquals(expected,vehicleType5.getVehicleType(13,1));
    }
}