import java.util.Map;

public class Item {
    //Map<String, Integer> priceList;
    //Map<String, Integer> stockList;
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        //this.priceList.put(product, unitPrice);
        //this.stockList.put(product, qty);
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.qty * this.unitPrice; 
    }

    public void increaseQuantity() {
        this.qty += 1;
    }

    public String toString() {
        return this.product + ": " + this.qty;
    }
}
