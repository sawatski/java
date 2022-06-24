package lab4.tests;

import lab4.*;
import lab4.persons.Firefighter;
import lab4.persons.Person;
import lab4.persons.Policeman;
import lab4.vehicles.Bus;
import lab4.vehicles.FireTruck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {

    @Test
    void getCountOfHumans() throws Exception {
        Road road = new Road();

        Person busDriver = new Person("Федір", "Достоєвський", 35);
        int numberOfSeats1 = 4;
        Bus bus = new Bus(busDriver, numberOfSeats1);
        Person[] persons = new Person[] {
                new Person("Кнут", "Гамсун", 45),
                new Firefighter("Габріель", "Маркес", 56),
                new Policeman("Томас", "Манн", 28)
        };
        for (Person person:
                persons) {
            bus.addPassenger(person);
        }

        Firefighter firefighterDriver = new Firefighter("Федір", "Достоєвський", 35);
        int numberOfSeats2 = 4;
        FireTruck fireTruck = new FireTruck(firefighterDriver, numberOfSeats2);
        Firefighter[] firefighters = new Firefighter[] {
                new Firefighter("Кнут", "Гамсун", 45),
                new Firefighter("Габріель", "Маркес", 56),
        };
        for (Firefighter firefighter:
                firefighters) {
            fireTruck.addPassenger(firefighter);
        }

        road.addCarToRoad(fireTruck);
        road.addCarToRoad(bus);

        int expectedCount = fireTruck.getNumberOfOccupiedSeats() + bus.getNumberOfOccupiedSeats();
        assertEquals(expectedCount, road.getCountOfHumans());
    }
}