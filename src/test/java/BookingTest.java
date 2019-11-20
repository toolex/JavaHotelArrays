import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(113, 2, "Double", 50);
        booking = new Booking(1, bedroom);
    }
}
