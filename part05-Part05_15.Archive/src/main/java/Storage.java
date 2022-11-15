public class Storage {
    private String id;
    private String name;

    public Storage(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if(!(compared instanceof Storage)) {
            return false;
        }

        Storage comparedStorage = (Storage) compared;

        if (this.id.equals(comparedStorage.id)) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
}