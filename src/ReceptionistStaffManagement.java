import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReceptionistStaffManagement {

    private Map<Integer, Receptionist> receptionistList = new HashMap<>();
    private int nextId = 1;

    // Add Receptionist
    public Receptionist addReceptionist(String name, String email, String phone, String shift) {
        Receptionist r = new Receptionist(nextId++, name, email, phone, shift);
        receptionistList.put(r.getId(), r);
        return r;
    }

    // Get one receptionist
    public Receptionist getReceptionist(int id) {
        return receptionistList.get(id);
    }

    // Return all receptionists
    public List<Receptionist> getAllReceptionists() {
        return new ArrayList<>(receptionistList.values());
    }

    // Update
    public boolean updateReceptionist(int id, String name, String email, String phone, String shift, boolean active) {
        Receptionist r = receptionistList.get(id);
        if (r == null) return false;

        r.setName(name);
        r.setEmail(email);
        r.setPhone(phone);
        r.setShift(shift);
        r.setActive(active);

        return true;
    }

    // Delete
    public boolean deleteReceptionist(int id) {
        return receptionistList.remove(id) != null;
    }
}
