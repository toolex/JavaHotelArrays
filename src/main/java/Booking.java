import java.util.HashMap;

public class Booking {
    private Bedroom bookedBedroom;
    private Integer nightsBooked;

    public Booking(Integer nightsBooked, Bedroom bedroom){
    this.bookedBedroom = bedroom;
    this.nightsBooked = nightsBooked;
    }

    public int numberofNightsBooked() {
        return this.nightsBooked;
    }

    public int findRoomNumber() {
        return this.bookedBedroom.guestRoomNumber();
    }

//    public void setNewBooking(Bedroom bedroom) {
//        this.bookedBedroom.setRoomAsNewRoom(bedroom);
//    }

    public int priceTotal() {
        return this.nightsBooked * bookedBedroom.getPrice();
    }

}
