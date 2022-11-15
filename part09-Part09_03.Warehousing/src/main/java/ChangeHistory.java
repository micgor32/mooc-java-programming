import java.util.ArrayList;

public class ChangeHistory{
    private ArrayList<Double> list;
    
    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        this.list.add(status);
    }

    public void clear() {
        //for (Double search : this.list) {
        //    this.list.remove(search);
        //}
        this.list.clear();
    }

    public double maxValue() {
        double largest = this.list.get(0);

        if (this.list.isEmpty()) {
            return 0;
        }

        for (Double search : this.list) {
            if (largest < search) {
                largest = search;
            }
        }
        return largest;
    }

    public double minValue() {
        double smallest = this.list.get(0);

        if (this.list.isEmpty()) {
            return 0;
        }

        for (Double search : this.list) {
            if (smallest > search) {
                smallest = search;
            }
        }
        return smallest;
    }

    public double average() {
        if (this.list.isEmpty()) {
            return 0;
        }

        double sum = 0.0;
        for (Double search : this.list) {
            sum += search;
        }

        return sum / this.list.size();
    }

    public String toString() {
        return this.list.toString();
    }
}

