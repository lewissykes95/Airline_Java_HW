import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    Flight flight;
    Flight flight2;

    Date date;

    Pilot pilot;
    Pilot pilot2;

    Plane plane;
    Plane plane2;


    @Before
    public void setUp() {
        passenger = new Passenger("David", 1, flight);
        flight = new Flight(pilot, plane, "EZY814", "LDN", "EDI", date);
        flight2 = new Flight(pilot2, plane2, "EZY954", "PAR", "MAN", date);
    }

    @Test
    public void canGetPassengerName() {
        assertEquals("David", passenger.getName());
    }

    @Test
    public void canGetPassengerBags() {
        assertEquals(1, passenger.getNumberOfBags());
    }



//    @Test
//    public void canGetSeatNumber() {
//        passenger.setRandomSeatNumber();
//        assertEquals(0, passenger.getSeatNumber());
//    }

    @Test
    public void canAssignFlight() {
        passenger.setFlight(flight2);
        assertEquals(flight2, passenger.getFlight());
    }


}
