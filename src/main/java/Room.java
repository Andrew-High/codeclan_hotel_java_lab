import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

//
//    public int getCapacity() {
//        return this.getCapacity();
//    }
//
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public ArrayList<Guest> getGuests() {
//        return this.getGuests();
//    }
//
//    public void setGuests(ArrayList<Guest> guests) {
//        this.setGuests(guests);
//    }

}
