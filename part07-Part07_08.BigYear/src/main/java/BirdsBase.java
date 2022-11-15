import java.util.ArrayList;

public class BirdsBase {
    private ArrayList<Birds> birds;
    
    public BirdsBase() {
        this.birds = new ArrayList<>();
    }

    public void addBird(Birds bird) {
        this.birds.add(bird);
    }

    public void printBirds() {
        for (Birds e : this.birds) {
            System.out.println(e);
        }
    }

    public void printSpecBird(String name) {
        for (Birds search : birds) {
            if (search.getName().equals(name)) {
                System.out.println(search);
            }
        }
    }

    public void addObs(String name) {
        if (!this.birds.contains(name)) {
            System.out.println("Not a bird!");
        }
        for (Birds search : birds) {
            if (search.getName().equals(name)) {
                search.addObs(1);
            }
        }
    }
}
