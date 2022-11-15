import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> list;
    
    public OneItemBox() {
        this.list = new ArrayList<>();
    }

    public void add(Item item) {
        if (this.list.isEmpty()) {
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