import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack () {
        this.stack = new ArrayList<>();
    }

    public void add(String value) {
        this.stack.add(value);
    }


    public boolean isEmpty() {
        if (this.stack.isEmpty()) {
            return true;
        }

        return false;
    } 

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        int getlast = this.stack.size() - 1;
        String lastString = this.stack.get(getlast);
        this.stack.remove(getlast);
        return lastString;
    }
}
