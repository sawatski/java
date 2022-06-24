package lab4.vehicles;

import lab4.persons.Person;

public class Bus extends Vehicle<Person>{

    public Bus(Person driver, int numberOfSeats) {
        super(driver, numberOfSeats);
    }
}
