import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PilotTest {


    Pilot pilot;
    Plane plane;
    Flight flight;

    Date date;


    @Before
    public void setUp(){
        pilot = new Pilot("John", Rank.CAPTAIN, "FN3467845");
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(pilot, plane, "EZY814", "LDN", "EDI", date);

    }

    @Test
    public void canGetPilotsName() {
        assertEquals("John", pilot.getName());
    }

    @Test
    public void canGetPilotsRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canGetPilotsLicenseNumber() {
        assertEquals("FN3467845", pilot.getLicenseNumber());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("Can Fly!", pilot.flyPlane(pilot));
    }


}
