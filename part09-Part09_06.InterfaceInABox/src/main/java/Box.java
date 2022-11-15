import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> boxes;
    private double maxWeight;

    public Box(double maxWeight) {
        this.boxes = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public double weight() {
        double boxWeight = 0.0;

        for (Packable search : this.boxes) {
            boxWeight += search.weight();
        }

        double weight = boxWeight;
        return weight; 
    }

    public void add(Packable toAdd) {
        if (boxesCapacity(toAdd) == true) {
            boxes.add(toAdd);
        }
    }

    private boolean boxesCapacity(Packable packable) {
        double getBoxWeight = 0.0;

        for (Packable search : this.boxes) {
            getBoxWeight += search.weight();
        }

        if (getBoxWeight + packable.weight() <= this.maxWeight) {
            return true;
        }

        return false;
    }

    public String toString() {
        return "Box: " + this.boxes.size() + " items, " + "total weight " + this.weight() + " kg";
    }
}
