import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(4, RoomType.DOUBLE);
        hotel = new Hotel("Fawlty Towers");
    }

    @Test
    public void hasName(){
        assertEquals("Fawlty Towers", hotel.getName());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedrooms().size());
    }
}
