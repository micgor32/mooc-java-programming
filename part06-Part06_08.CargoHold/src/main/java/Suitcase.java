import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int weight = 0;
        for (Item object : items) { 
            weight = weight + object.getWeight();
        } 
        //System.out.println("weight teraz" + weight);
        if (weight < maxWeight && weight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } 
        int weight = 0;
        int howManyItems = 0;
        for (Item object : items) {
            weight = weight + object.getWeight();
            howManyItems++;
        }

        if (howManyItems == 1) {
            return "1 item (" + weight + " kg)";
        }

        return howManyItems + " items (" + weight + " kg)";
    }

    public void printItems() {
        //String name;
        //int weight = 0;
        String output = "";

        for (Item object : items) {
            output = output + object.getName() + " (" + object.getWeight() + " kg)\n";
        }
        System.out.println(output);
    }

    public int totalWeight() {
        int weight = 0;
        for (Item object : items) {
            weight = weight + object.getWeight();
        }
        return weight;
    }
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        } 

        Item itemWeight = this.items.get(0);
        for (Item object : items) {
            if (object.getWeight() > itemWeight.getWeight()) {
                itemWeight = object;
            }
        }
        return itemWeight;
    }
}
