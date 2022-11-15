import java.util.ArrayList;

public class A {
    private ArrayList<String> list;

    public A() {
        this.list = new ArrayList<>();
    }

    public void a() {
        this.list.add("something");
        this.list.add("something1");
        System.out.println("A");
    } 

    public String toString() {
        return this.list.size() + this.list.toString();
    }
}