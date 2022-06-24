package lab4;

import lab4.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Road {
    private final List<Vehicle<?>> carsInRoad = new ArrayList<>();
    public int getCountOfHumans(){
        int count = 0;
        for (Vehicle<?> car:
             carsInRoad) {
            count += car.getNumberOfOccupiedSeats();
        }
        return count;
    }
    public <T extends Vehicle<?>> void addCarToRoad(T car){
        carsInRoad.add(car);
    }
}
