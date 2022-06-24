package lab4.tests;

import lab4.vehicles.Bus;
import lab4.persons.Firefighter;
import lab4.persons.Person;
import lab4.persons.Policeman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {

    @Test
    void testAddPassenger() throws Exception {
        Person driver = new Person("Федір", "Достоєвський", 35);
        int numberOfSeats = 4;
        Bus bus = new Bus(driver, numberOfSeats);
        Person[] persons = new Person[] {
                new Person("Кнут", "Гамсун", 45),
                new Firefighter("Габріель", "Маркес", 56),
                new Policeman("Томас", "Манн", 28)
        };

        for (Person person:
             persons) {
            bus.addPassenger(person);
        }

        assertEquals(4, bus.getNumberOfOccupiedSeats());
    }

    @Test
    void testAddPassengerPlacesAreOver() throws Exception {
        Person driver = new Person("Федір", "Достоєвський", 35);
        int numberOfSeats = 4;
        Bus bus = new Bus(driver, numberOfSeats);
        Person[] persons = new Person[] {
                new Person("Кнут", "Гамсун", 45),
                new Firefighter("Габріель", "Маркес", 56),
                new Policeman("Томас", "Манн", 28)
        };

        for (Person person:
                persons) {
            bus.addPassenger(person);
        }

        Person newPassenger = new Person("Франц", "Кафка", 70);

        assertEquals(4, bus.getNumberOfOccupiedSeats());
        assertThrows(Exception.class, ()->{
            bus.addPassenger(newPassenger);
        });
    }

    @Test
    void testRemovePassenger() throws Exception {
        Person driver = new Person("Федір", "Достоєвський", 35);
        int numberOfSeats = 4;
        Bus bus = new Bus(driver, numberOfSeats);
        Person[] persons = new Person[] {
                new Person("Кнут", "Гамсун", 45),
                new Firefighter("Габріель", "Маркес", 56),
                new Policeman("Томас", "Манн", 28)
        };

        for (Person person:
                persons) {
            bus.addPassenger(person);
        }

        assertEquals(4, bus.getNumberOfOccupiedSeats());

        bus.removePassenger(persons[2]);
        assertEquals(3, bus.getNumberOfOccupiedSeats());
    }

    @Test
    void testRemovePassengerAbsent() throws Exception {
        Person driver = new Person("Федір", "Достоєвський", 35);
        int numberOfSeats = 4;
        Bus bus = new Bus(driver, numberOfSeats);
        Person[] persons = new Person[] {
                new Person("Кнут", "Гамсун", 45),
                new Firefighter("Габріель", "Маркес", 56)
        };

        for (Person person:
                persons) {
            bus.addPassenger(person);
        }
        Person absentPassenger = new Policeman("Томас", "Манн", 28);

        assertEquals(3, bus.getNumberOfOccupiedSeats());

        assertThrows(Exception.class, ()->{
            bus.removePassenger(absentPassenger);
        });
    }
}