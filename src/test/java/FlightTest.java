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
    Date date;


@Before
    public void setUp() {
    date = new Date("09:00");
    passenger = new Passenger("David", 1, flight);
    pilot = new Pilot("John", Rank.CAPTAIN, "FN3467845");
    cabinCrewMember = new CabinCrewMember("Amy", Rank.FLIGHTATTENDANT);
    plane = new Plane(PlaneType.BOEING747);
    flight = new Flight(pilot, plane, "EZY814", "LDN", "EDI", date);
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
    assertEquals("09:00", flight.getDateTime());
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
