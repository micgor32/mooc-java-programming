public class Cube {
    private int edgeLength;
    
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        int vol = 0;
        vol = (this.edgeLength * this.edgeLength) * this.edgeLength;
        return vol;
    }

    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + volume();
    }
}
