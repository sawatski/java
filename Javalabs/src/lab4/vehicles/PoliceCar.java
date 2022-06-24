package lab4.vehicles;

import lab4.persons.Policeman;

public class PoliceCar extends Car<Policeman>{

    public PoliceCar(Policeman driver, int numberOfSeats) {
        super(driver, numberOfSeats);
    }
}
