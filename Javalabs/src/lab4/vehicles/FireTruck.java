package lab4.vehicles;

import lab4.persons.Firefighter;

public class FireTruck extends Car<Firefighter>{

    public FireTruck(Firefighter driver, int numberOfSeats) {
        super(driver, numberOfSeats);
    }
}
