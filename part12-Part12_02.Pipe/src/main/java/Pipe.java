import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }

    public T takeFromPipe() {
        if (this.pipe.isEmpty()) {
            return null;
        }

        int indexOfValueToRemove = 0;
        T toReturn = this.pipe.get(indexOfValueToRemove);
        this.pipe.remove(indexOfValueToRemove);
        return toReturn;
    }

    public boolean isInPipe() {
        if (this.pipe.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }
}
