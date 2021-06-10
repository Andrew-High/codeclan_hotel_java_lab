import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;

    public Room(ArrayList guests){
        this.guests = new ArrayList<Guest>();
    }

}
