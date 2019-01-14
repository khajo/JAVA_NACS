package week_6.src.car;

import week_6.src.car.Car;

import java.util.Random;

public class Cars {


    public Car getNextCar(String brand) {
       Car car = new ManualCar(brand);
        Random random = new Random();
        Boolean randomBoolean = random.nextBoolean();
        if(randomBoolean == true){
          car = new ManualCar(brand);
           return car;
        } else car = new AutomaticCar(brand);

        return car;
    }
}
