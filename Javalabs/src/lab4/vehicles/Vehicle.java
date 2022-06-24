package lab4.vehicles;

import lab4.persons.Person;

import java.util.ArrayList;

public abstract class Vehicle <T extends Person> {
    private final T driver;
    private final int numberOfSeats;
    private final ArrayList<T> passengers = new ArrayList<>();

    public Vehicle(T driver, int numberOfSeats) {
        this.driver = driver;
        this.numberOfSeats = numberOfSeats;
    }

    public void addPassenger(T passenger) throws Exception {
        if (getNumberOfOccupiedSeats() >= this.numberOfSeats) {
            throw new Exception("Всі місця зайняті");
        }
        this.passengers.add(passenger);
    }

    public void removePassenger(T passenger) throws Exception {
        if (!passengers.contains(passenger)) {
            throw new Exception("Пасажира немає в транспортному засобі");
        }
        this.passengers.remove(passenger);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfOccupiedSeats() {
        int result = passengers.size();
        if (driver != null) {
            result += 1;
        }
        return result;
    }
}
