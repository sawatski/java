package lab4.vehicles;

import lab4.persons.Person;

public class Taxi extends Car<Person>{

    public Taxi(Person driver, int numberOfSeats) {
        super(driver, numberOfSeats);
    }
}
