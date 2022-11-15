
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) { 
            return "The collection " + this.name + " is empty.";
        } 

        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:\n" + this.elements.get(0);
        }

        String tempOutput = ""; 
        /*for (int i = 0; i < this.elements.size(); i++) { 
            tempOutput = tempOutput + this.elements.get(i) + "\n";
        } */
        for (String search : this.elements) {
            tempOutput += this.elements.get(this.elements.indexOf(search)) + "\n";
        }

        return "The collection " + this.name + " has " + (elements.size()) + " elements:\n" + tempOutput;
    }
}