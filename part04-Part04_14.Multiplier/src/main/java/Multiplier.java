public class Multiplier {
    private int number;

    public Multiplier(int dig) {
        number = dig;
    }

    public int multiply(int number) {
        number = number * this.number;
        return number;
    }
}
