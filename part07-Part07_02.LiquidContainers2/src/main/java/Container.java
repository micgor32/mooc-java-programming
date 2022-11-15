
public class Container {
    private int amountOfLiquid;
    private int maxAmount;

    public Container() {
        this.amountOfLiquid = 0;
        this.maxAmount = 100;
    }

    public int contains() {
        return this.amountOfLiquid;
    }

    public void add(int amount) {
        if (this.amountOfLiquid <= this.maxAmount && amount >= 0) {
            this.amountOfLiquid += amount;
            if (this.amountOfLiquid > maxAmount) {
                this.amountOfLiquid = maxAmount;
            }
        }
    }

    public void remove(int amount) {
        if ((this.amountOfLiquid - amount) >= 0) {
            this.amountOfLiquid -= amount;
        } else if ((this.amountOfLiquid - amount) < 0) {
            this.amountOfLiquid = 0;
        }
    }

    public String toString() {
        return this.amountOfLiquid + "/" + this.maxAmount;
    }
}
