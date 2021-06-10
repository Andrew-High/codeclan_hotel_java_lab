import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
    private int capacity = roomType.getCapacity();
    private ArrayList<Guest> guests;


    public Bedroom(ArrayList guests, int roomNumber, RoomType roomType){
        super(guests);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(ArrayList<Guest> numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
}
