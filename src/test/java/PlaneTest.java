import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(250, plane.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeight() {
        assertEquals(35000.00, plane.getPlaneWeight(), 0.0);
    }


}
