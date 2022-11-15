public class Book {
    private String name;
    private int recAge;
    
    public Book(String name, int recAge) {
        this.name = name;
        this.recAge = recAge;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.recAge;
    }

    /*@Override
    public int compareTo(Book book) {
        if (this.recAge == book.getAge()) {
            return 0;
        } else if (this.recAge > book.getAge()) {
            return 1;
        } else {
            return -1;
        } 
    } */

    public String toString() {
        return this.name + " (recommended for " + this.recAge + " year-olds or older)";
    }
}
