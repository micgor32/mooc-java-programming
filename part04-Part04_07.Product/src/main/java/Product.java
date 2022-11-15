public class Product {
    private String name;
    private double price;
    private int qnt;

    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.qnt = initialQuantity;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + qnt + " pcs");
    }
}
