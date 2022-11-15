public class CD implements Packable {
    private String artist;
    private String name;
    private int year;
    private final double weight = 0.1;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.artist + ": " + this.name + " (" + this.year + ")";
    }
}
