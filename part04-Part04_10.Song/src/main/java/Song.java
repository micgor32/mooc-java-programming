public class Song {
    private String sname;
    private int slenght;

    public Song(String name, int length) {
        this.sname = name;
        this.slenght = length;
    }

    public String name() {
        return sname;
    }

    public int length() {
        return slenght;
    }

    
}