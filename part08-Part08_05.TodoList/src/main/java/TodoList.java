import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int ind = 1;
        for (String e : this.list) {
            System.out.println(ind + ": " + e);
            ind++;
        }
    }

    public void remove(int number) {
        this.list.remove(number -1);
    }
}
