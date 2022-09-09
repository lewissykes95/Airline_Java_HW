import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CabinCrewTest {


    CabinCrewMember cabinCrewMember;


    @Before
    public void setUp() {
        cabinCrewMember = new CabinCrewMember("Amy", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void canGetCabinCrewMemberName() {
        assertEquals("Amy", cabinCrewMember.getName());
    }

    @Test
    public void canGetCabinCrewMemberRank() {
        assertEquals(Rank.FLIGHTATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void flightAttendantCanMessage() {
        assertEquals("Can you fasten your seatbelts?", cabinCrewMember.messagePassengers(cabinCrewMember));
    }

}
