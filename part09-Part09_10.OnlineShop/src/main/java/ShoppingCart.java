import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> list;
    
    public ShoppingCart() {
        this.list = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!this.list.containsKey(product)) {
            this.list.put(product, new Item(product, 1, price));
        } else {
            this.list.get(product).increaseQuantity();
        }
    }

    public int price() {
        int price = 0;
        for (Item search : this.list.values()) {
            price += search.price();
        }
        return price;
    }

    public void print() {
        for (Item search : this.list.values()) {
            System.out.println(search);
        }
    }

    public void increase(String product) {
        this.list.get(product).increaseQuantity();
    }
}
