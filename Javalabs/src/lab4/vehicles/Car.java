package lab4.vehicles;

import lab4.persons.Person;

public abstract class Car<T extends Person> extends Vehicle<T>{

    public Car(T driver, int numberOfSeats) {
        super(driver, numberOfSeats);
    }
}
