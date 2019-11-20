import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private String name;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.name = name;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Bedroom> getVacantBedrooms() {
        
    }
}
