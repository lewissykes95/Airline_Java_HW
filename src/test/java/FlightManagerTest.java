import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    Passenger passenger;
    Passenger passenger2;

    Plane plane;

    Plane plane2;

    FlightManager flightManager;

    Pilot pilot;
    Pilot pilot2;

    Flight flight;
    Flight flight2;

    Date date;




    @Before
    public void setUp() {
        passenger = new Passenger("David", 1, flight, 20);
        passenger2 = new Passenger("Lewis", 3, flight2, 25);
        pilot = new Pilot("John", Rank.CAPTAIN, "FN3467845");
        pilot2 = new Pilot("Richard", Rank.CAPTAIN, "FN3534335");
        plane = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.BOEING777);
        flight = new Flight(pilot, plane, "EZY814", "LDN", "EDI", date);
        flight2 = new Flight(pilot2, plane2, "EZY954", "PAR", "MAN", date);
        flightManager = new FlightManager();
    }

    @Test
    public void canCalculateBaggageWeightForEachPassenger() {
        assertEquals(20, flightManager.calculateWeight(flight));
    }

    @Test
    public void canCalculateBaggageWeightForEachPassenger2() {
        assertEquals(30, flightManager.calculateWeight(flight2));
    }

    @Test
    public void calculateHowMuchBaggageBooked() {
        assertEquals(20, flightManager.bookBaggage(flight, passenger));
    }

    @Test
    public void calculateHowMuchBaggageBooked2() {
        assertEquals(30, flightManager.bookBaggage(flight2, passenger2));
    }



}
