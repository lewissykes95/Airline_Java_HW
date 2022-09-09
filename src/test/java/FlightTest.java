import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Flight flight;
    Plane plane;




@Before
    public void setUp() {
    passenger = new Passenger("David", 1);
    pilot = new Pilot("John", Rank.CAPTAIN, "FN3467845");
    cabinCrewMember = new CabinCrewMember("Amy", Rank.FLIGHTATTENDANT);
    plane = new Plane(PlaneType.BOEING747);
    flight = new Flight(pilot, plane, "EZY814", "LDN", "EDI", "09:00");
}


@Test
public void canGetFlightNumber(){
    assertEquals("EZY814", flight.getFlightNumber());
}

@Test
public void canGetDestination() {
    assertEquals("LDN", flight.getDestination());
}

@Test
public void canGetDepartureAirport() {
    assertEquals("EDI", flight.getDepartureAirport());
}

@Test
public void canGetDepartureTime() {
    assertEquals("09:00", flight.getDepartureTime());
}


@Test
    public void canReturnNumberOfSeats() {
    assertEquals(250, plane.getPlaneCapacity());
}

@Test
    public void canBookPassengerIfSeatsAvailable() {
    flight.bookPassenger(passenger);
    assertEquals(1, flight.getBookedPassengers());
}

}
