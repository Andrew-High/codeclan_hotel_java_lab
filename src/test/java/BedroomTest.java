import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Joe");
        bedroom = new Bedroom(4, RoomType.DOUBLE);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(4, bedroom.getRoomNumber());
    }
}
