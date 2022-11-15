
public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double res = 0;
        double max;
        max = 206.3 - (0.711 * age);
        res = (max - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
        return res;
    }
}