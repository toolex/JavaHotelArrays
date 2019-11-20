import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;
    private Guest guest6;
    private ConferenceRoom conferenceRoomA1;
    private ConferenceRoom conferenceRoomB2;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Booking booking1;
    private Booking booking2;
    private Booking booking3;
    private Booking booking4;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Bedroom> newBedrooms;


    @Before
    public void before(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.bedrooms.add(bedroom1);
        this.bedrooms.add(bedroom2);

        this.newBedrooms = new ArrayList<Bedroom>();
        this.newBedrooms.add(bedroom2);

        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.conferenceRooms.add(conferenceRoomA1);
        this.conferenceRooms.add(conferenceRoomB2);

        this.hotel = new Hotel("Hotel CodeClan", bedrooms, conferenceRooms);

        this.conferenceRoomA1 = new ConferenceRoom(5, "A1");
        this.conferenceRoomB2 = new ConferenceRoom(10, "B2");

        this.bedroom1 = new Bedroom(404,2,"Double", 50);
        this.bedroom2 = new Bedroom(306,1,"Single", 25);

        guest1 = new Guest("Bob");
        guest2 = new Guest("Alice");
        guest3 = new Guest("Sarah");
        guest4 = new Guest("Jim");
        guest5 = new Guest("Sally");
        guest6 = new Guest("Ross");

        booking1 = new Booking(1, bedroom1);
        booking2 = new Booking(2, bedroom1);
        booking3 = new Booking(3, bedroom1);
        booking4 = new Booking(4, bedroom1);
    }

    @Test
    public void conferenceRoomStartsEmpty(){
        assertEquals(0, conferenceRoomA1.guestsCount());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceRoomA1.addGuest(guest1);
        assertEquals(1, conferenceRoomA1.guestsCount());
    }

    @Test
    public void checkingCapacityOfConferenceRoom(){
        conferenceRoomA1.addGuest(guest1);
        conferenceRoomA1.addGuest(guest2);
        conferenceRoomA1.addGuest(guest3);
        conferenceRoomA1.addGuest(guest4);
        conferenceRoomA1.addGuest(guest5);
        conferenceRoomA1.addGuest(guest6);
        assertEquals(5, conferenceRoomA1.guestsCount());
    }

    @Test
    public void removeGuestFromConferenceRoom(){
        conferenceRoomA1.addGuest(guest2);
        conferenceRoomA1.addGuest(guest3);
        conferenceRoomA1.removeGuest(guest2);
        assertEquals(1, conferenceRoomA1.guestsCount());
    }

    @Test
    public void bedroomStartsEmpty(){
        assertEquals(0, bedroom1.guestsCount());
    }

    @Test
    public void canAddGuestToBedroom(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestsCount());
    }

    @Test
    public void checkingCapacityOfBedroom(){
        bedroom2.addGuest(guest2);
        bedroom2.addGuest(guest3);
        assertEquals(1, bedroom2.guestsCount());
    }

    @Test
    public void removeGuestFromBedroom(){
        bedroom1.addGuest(guest2);
        bedroom1.addGuest(guest3);
        bedroom1.removeGuest(guest2);
        assertEquals(1, bedroom1.guestsCount());
    }

    @Test
    public void hotelHasName(){
        assertEquals("Hotel CodeClan", hotel.getName());
    }

    @Test
    public void initialRoomBookingMade(){
        assertEquals(2, booking2.numberofNightsBooked());
    }

    @Test
    public void findBookingRoomNumber(){
        assertEquals(404, booking1.findRoomNumber());
    }

    @Test
    public void findCostOfBookinbg(){
        assertEquals(150, booking3.priceTotal());
    }

    @Test
    public void findVacantBedrooms(){
        bedroom1.addGuest(guest1);
        assertEquals(1, hotel.getVacantBedrooms());
    }

}
