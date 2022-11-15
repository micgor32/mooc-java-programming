
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        //int numberCount = 0;
    }

    public void addNumber(int number) {
        this.count = this.count + 1; 
        this.sum = this.sum + number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        double result = 0; 
        if (this.sum != 0 && this.count != 0) {
            result = this.sum / (double) this.count;
        }
        return result; //this.sum / (double) this.count;
    }
}
