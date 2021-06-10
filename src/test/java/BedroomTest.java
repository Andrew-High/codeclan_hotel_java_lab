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

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, bedroom.getGuests().size());
    }


    @Test
    public void canAddGuests(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }
}
