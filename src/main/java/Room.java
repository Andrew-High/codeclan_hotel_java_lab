import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private int capacity;
    private ArrayList<Guest> numberOfGuests;

    public Room(RoomType roomType, int capacity, ArrayList numberOfGuests){
        this.roomType = roomType;
        this.capacity = capacity;
        this.numberOfGuests = numberOfGuests;
    }
    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getValueFromEnum() {
        return this.roomType.getValue();
    }
}
