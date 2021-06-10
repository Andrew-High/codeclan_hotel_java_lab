import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("The Glenfiddich Suite");
    }

    @Test
    public void hasName(){
        assertEquals("The Glenfiddich Suite", conferenceRoom.getName());
    }

    @Test
    public void canSetName(){
        conferenceRoom.setName("The Balvenie Suite");
        assertEquals("The Balvenie Suite", conferenceRoom.getName());
    }
}
