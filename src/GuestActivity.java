import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuestActivity {

    private Map<Integer, Guest> guestList = new HashMap<>();
    private int nextId = 1;

    // Add guest
    public Guest addGuest(String name, String roomNumber, Date checkIn) {
        Guest g = new Guest(nextId++, name, roomNumber, checkIn);
        guestList.put(g.getId(), g);
        return g;
    }

    // Get single guest
    public Guest getGuest(int id) {
        return guestList.get(id);
    }

    // Add activity
    public boolean addActivity(int guestId, String activity) {
        Guest g = guestList.get(guestId);
        if (g == null) return false;

        g.addActivity(activity);
        return true;
    }

    // Check-out guest
    public boolean checkoutGuest(int guestId, Date checkOut) {
        Guest g = guestList.get(guestId);
        if (g == null) return false;

        g.setCheckOut(checkOut);
        return true;
    }

    // List all guests
    public List<Guest> getAllGuests() {
        return new ArrayList<>(guestList.values());
    }
}
