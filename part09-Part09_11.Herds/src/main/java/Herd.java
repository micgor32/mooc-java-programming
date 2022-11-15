import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable{
    private List<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable search : this.list) {
            search.move(dx, dy);
        }
    }

    public String toString() {
        String toReturn = "";
        for (Movable search : this.list) {
            toReturn += search + "\n";
        }
        return toReturn;
    }
}
