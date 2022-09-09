import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {


    Passenger passenger;
    Pilot pilot;
    Flight flight;
    Plane plane;



@Before
    public void before() {
    passenger = new Passenger("David", 1);
    pilot = new Pilot("John", Rank.CAPTAIN, "PA3467845");
    plane = new Plane(PlaneType.BOEING747);
    flight = new Flight(pilot, plane, "EZY814", "LDN", "EDI", "09:00");
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
