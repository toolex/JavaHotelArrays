import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    @Before
    public void before(){
        this.bedroom1 = new Bedroom(404, 2, "Double", 50);
        this.bedroom2 = new Bedroom(306, 1, "Single", 25);
        this.bedroom3 = new Bedroom(200, 4, "Family", 100);
        guest1 = new Guest("Bob");
        guest2 = new Guest("Alice");
        guest3 = new Guest("Sarah");
        guest4 = new Guest("Jim");
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom1.guestsCount());
    }

    @Test
    public void canAddGuest(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestsCount());
    }

    @Test
    public void checkingCapacityOfRoom(){
        bedroom2.addGuest(guest2);
        bedroom2.addGuest(guest3);
        assertEquals(1, bedroom2.guestsCount());
    }

    @Test
    public void removeGuestFromRoom(){
        bedroom1.addGuest(guest2);
        bedroom1.addGuest(guest3);
        bedroom1.removeGuest(guest2);
        assertEquals(1, bedroom1.guestsCount());
    }

    @Test
    public void checkGetPrice(){
        assertEquals(50, bedroom1.getPrice());
    }
}
