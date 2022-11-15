import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        //if (!this.owners.get(licensePlate).equals(owner)) { // add explanation why it is not working
        if (!this.owners.containsKey(licensePlate)) {    
            this.owners.put(licensePlate, owner);
            return true;  
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (!this.owners.containsKey(licensePlate)) {
            return null;
        }

        return this.owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.owners.containsKey(licensePlate)) {
            return false;
        }

        this.owners.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate key : this.owners.keySet()) {
            System.out.println(key);
        }
    }

    public void printOwners() {
        ArrayList<String> alreadyPrinted = new ArrayList<>();

        for (String owner : this.owners.values()) {
            if (alreadyPrinted.contains(owner) == true) {
                continue;
            }
            System.out.println(owner);
            alreadyPrinted.add(owner);
        }
    }
}