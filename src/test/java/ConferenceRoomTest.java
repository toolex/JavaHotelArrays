import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;
    private Guest guest6;
    private ConferenceRoom conferenceRoomA1;
    private ConferenceRoom conferenceRoomB2;

    @Before
    public void before(){
        this.conferenceRoomA1 = new ConferenceRoom(5, "A1");
        this.conferenceRoomB2 = new ConferenceRoom(10, "B2");
        guest1 = new Guest("Bob");
        guest2 = new Guest("Alice");
        guest3 = new Guest("Sarah");
        guest4 = new Guest("Jim");
        guest5 = new Guest("Sally");
        guest6 = new Guest("Ross");
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoomA1.guestsCount());
    }

    @Test
    public void canAddGuest(){
        conferenceRoomA1.addGuest(guest1);
        assertEquals(1, conferenceRoomA1.guestsCount());
    }

    @Test
    public void checkingCapacityOfRoom(){
        conferenceRoomA1.addGuest(guest1);
        conferenceRoomA1.addGuest(guest2);
        conferenceRoomA1.addGuest(guest3);
        conferenceRoomA1.addGuest(guest4);
        conferenceRoomA1.addGuest(guest5);
        conferenceRoomA1.addGuest(guest6);
        assertEquals(5, conferenceRoomA1.guestsCount());
    }

    @Test
    public void removeGuestFromRoom(){
        conferenceRoomA1.addGuest(guest2);
        conferenceRoomA1.addGuest(guest3);
        conferenceRoomA1.removeGuest(guest2);
        assertEquals(1, conferenceRoomA1.guestsCount());
    }

}
