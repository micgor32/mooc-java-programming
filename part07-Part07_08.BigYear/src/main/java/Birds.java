public class Birds {
    private String name;
    private String latianName;
    private int observations;

    public Birds(String name, String latianName) {
        this.name = name;
        this.latianName = latianName;
    }

    public Birds(int observations) {
        this.observations = observations;
    }

    public Birds(String name, String latianName, int observations) {
        this.name = name;
        this.latianName = latianName;
        this.observations = observations;
    }

    public void addName(String name) {
        this.name = name;
    }

    public void addObs(int observations) {
        this.observations += observations;
    }

    public String getName() {
        return this.name;
    }

    public String getLatName() {
        return this.latianName;
    }

    public int observations() {
        return this.observations;
    }

    public String toString() {
        return this.name + " (" + this.latianName + "): " + this.observations + " observations";
    }
}

