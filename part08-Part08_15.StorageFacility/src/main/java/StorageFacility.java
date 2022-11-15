import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> list;

    public StorageFacility() {
        this.list = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.list.putIfAbsent(unit, new ArrayList<>());
        this.list.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        if (!this.list.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        return this.list.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (this.list.containsKey(storageUnit)) {
            this.list.get(storageUnit).remove(item);
            
            if (this.list.get(storageUnit).isEmpty()) {
                this.list.remove(storageUnit);
            }
        }

        //for (String remove : this.list.keySet()) {

//        }
        //if (this.list.containsKey(storageUnit)) {
          //  System.out.println(this.list.get(item));
        //}
        //ArrayList<String> toRemove = new ArrayList<>();

        /*for (String search : this.list.keySet()) {
            if (search.equals(storageUnit)) {
                System.out.println("test");
                this.list.remove(item);
            }
        } */
        //this.list.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> alreadyPrinted = new ArrayList<>();

        for (String owner : this.list.keySet()) {
            if (alreadyPrinted.contains(owner) == true) {
                continue;
            }
            alreadyPrinted.add(owner);
        }
        return alreadyPrinted;
    }
}
