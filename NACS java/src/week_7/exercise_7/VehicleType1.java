package week_7.exercise_7;

public class VehicleType1 implements Vehicle {
    @Override
    public Integer getVehicleType(Integer celebrities, Integer vahicle) {
        return celebrities-vahicle;
    }

    @Override
    public Boolean IsRight(Integer vehicletype1, Integer vahicle) {
        return vehicletype1==vahicle;
    }





}
