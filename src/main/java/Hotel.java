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


    public int getVacantBedrooms() {
        ArrayList<Bedroom> vacant = new ArrayList<Bedroom>();
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.guestsCount() == 0) {
                vacant.add(bedroom);
            }
        }
        return vacant.size();
    }
}
