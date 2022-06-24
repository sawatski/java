package lab4.tests;

import lab4.vehicles.FireTruck;
import lab4.persons.Firefighter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FireTruckTest {

    @Test
    void addPassenger() throws Exception {
        Firefighter driver = new Firefighter("Федір", "Достоєвський", 35);
        int numberOfSeats = 4;
        FireTruck fireTruck = new FireTruck(driver, numberOfSeats);
        Firefighter[] firefighters = new Firefighter[] {
                new Firefighter("Кнут", "Гамсун", 45),
                new Firefighter("Габріель", "Маркес", 56),
        };

        for (Firefighter firefighter:
                firefighters) {
            fireTruck.addPassenger(firefighter);
        }

        assertEquals(firefighters.length + 1, fireTruck.getNumberOfOccupiedSeats());
    }

    @Test
    void removePassenger() throws Exception {
        Firefighter driver = new Firefighter("Федір", "Достоєвський", 35);
        int numberOfSeats = 4;
        FireTruck fireTruck = new FireTruck(driver, numberOfSeats);
        Firefighter[] firefighters = new Firefighter[] {
                new Firefighter("Кнут", "Гамсун", 45),
                new Firefighter("Габріель", "Маркес", 56),
        };

        for (Firefighter firefighter:
                firefighters) {
            fireTruck.addPassenger(firefighter);
        }

        assertEquals(firefighters.length + 1, fireTruck.getNumberOfOccupiedSeats());

        fireTruck.removePassenger(firefighters[0]);
        assertEquals(2, fireTruck.getNumberOfOccupiedSeats());
    }
}