//import java.util.ArrayList;

public class Container {
    private int firstContainer;
    private int max;

    public Container() {
        this.firstContainer = 0;
        this.max = 100;
    }

    public int contains() {
        return this.firstContainer;
    }

    public void add(int amount) {
        if ((this.firstContainer + amount) <= this.max) {
            this.firstContainer += amount;
        } else {
            this.firstContainer = this.max;
        }
    }

    public void remove(int amount) {
        if ((this.firstContainer - amount) >= 0) {
            this.firstContainer -= amount;
        } else if ((this.firstContainer - amount) < 0) {
            this.firstContainer = 0;
        }
    }

    public String toString() {
        return this.firstContainer + "/" + this.max;
    }
}
