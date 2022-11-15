public class Film {
    private String name;
    private int age;

    public Film(String filmName, int filmAgeRating) {
        name = filmName;
        age = filmAgeRating;
    }

    public String name() {
        return name;
    }

    public int ageRating() {
        return age;
    }
}
