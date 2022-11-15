import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> list;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }

    public void add(Item item) {
        int weight = 0;
        for (Item w : this.list) {
            weight += w.getWeight();
        }
        if ((weight + item.getWeight()) <= this.capacity) {
            this.list.add(item);
        }
    }

    public boolean isInBox(Item item) {
        if (this.list.contains(item)) {
            return true;
        }

        return false;
    } 
}



