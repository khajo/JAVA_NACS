package week_7.exercise_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleType1Test {

    @Test
    void getVehicleType() {
        VehicleType1 vehicleType1 = new VehicleType1();
        Integer expected = 3;
        Assertions.assertEquals(expected,vehicleType1.getVehicleType(6,3));

    }
}