import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;


    @Before
    public void setUp() {
        passenger = new Passenger("David", 1);
    }

    @Test
    public void canGetPassengerName() {
        assertEquals("David", passenger.getName());
    }

    @Test
    public void canGetPassengerBags() {
        assertEquals(1, passenger.getNumberOfBags());
    }


}
