import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Collection;

public class Warehouse {
    private Map<String, Integer> priceList;
    private Map<String, Integer> stockList;
   // Set<String> product;
    //Collection<

    public Warehouse() {
        this.priceList = new HashMap<>();
        this.stockList = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.priceList.put(product, price);
        this.stockList.put(product, stock);
    }

    public int price(String product) {
        if (this.priceList.containsKey(product)) {
            return this.priceList.get(product);
        }

        return -99;
    }

    public int stock(String product) {
        if (this.stockList.containsKey(product)) {
            return this.stockList.get(product);
        }

        return 0;
    }

    public boolean take(String product) {
        if (this.stockList.containsKey(product)) {
            if (this.stockList.get(product) > 0) {
                int initialValue = this.stockList.get(product);
                this.stockList.put(product, initialValue - 1);
                return true;
            }
        }

        return false;
    }

    public Set<String> products() {
        Set<String> names = this.priceList.keySet();

        return names;
    }
}
