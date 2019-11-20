import java.util.ArrayList;

public class ConferenceRoom {
    private String name;
    private Integer capacity;
    private ArrayList<Guest> guestsInRoom;


    public ConferenceRoom(Integer capacity, String name) {
        this.guestsInRoom = new ArrayList<Guest>();
        this.name = name;
        this.capacity = capacity;
    }

    public int guestsCount() {
        return this.guestsInRoom.size();
    }

    public void addGuest(Guest guest) {
        if (this.capacity > this.guestsCount()) {
            this.guestsInRoom.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        if (this.guestsInRoom.size() > 0) {
            this.guestsInRoom.remove(guest);
        }
    }
}
