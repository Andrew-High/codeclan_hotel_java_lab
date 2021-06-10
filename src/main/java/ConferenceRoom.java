public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(String name){
        super(100);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
