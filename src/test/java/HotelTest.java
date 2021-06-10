import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(4, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom("The Glenfiddich Suite");
        hotel = new Hotel("Fawlty Towers");
        guest = new Guest("Bob");
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

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRooms().size());
    }

    @Test
    public void canAddGuestToBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addGuestToBedroom(guest, 4);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canRemoveGuestFromBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addGuestToBedroom(guest, 4);
        hotel.removeGuestFromBedroom(4, guest);
        assertEquals(0, bedroom.getGuests().size());
    }
}
