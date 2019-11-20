import java.util.ArrayList;

public class Bedroom {
    private Integer roomNumber;
    private Integer capacity;
    private ArrayList<Guest> guestsInRoom;
    private String type;
    private Integer price;

    public Bedroom(Integer roomNumber, Integer capacity, String type, Integer price){
        this.guestsInRoom = new ArrayList<Guest>();
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.price = price;
    }

    public int guestsCount() {
        return this.guestsInRoom.size();
    }

    public int getCapactity(){
        return this.capacity;
    }

    public int guestRoomNumber(){
        return this.roomNumber;
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

//    public void setRoomAsNewRoom(Bedroom bedroom) {
//        this.guestsInRoom = new ArrayList<Guest>();
//        this.roomNumber = bedroom.roomNumber;
//        this.capacity = bedroom.capacity;
//        this.type = bedroom.type;
//        this.price = bedroom.price;
//        System.out.println(bedroom);
//    }

    public int getPrice() {
        return this.price;
    }
}
