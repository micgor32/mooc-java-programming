public class Data implements Comparable<Data> {
    private String country;
    private int year;
    private String gender;
    private double literacy;

    public Data(String country, int year, String gender, double literacy) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacy = literacy;
    }

    public String getCountry() {
        return this.country;
    }

    public int getYear() {
        return this.year;
    }

    public String getGender() {
        String[] gender = this.gender.split(" ");
        return gender[0];
    }

    public double getLiteracy() {
        return this.literacy;
    }

    @Override
    public int compareTo(Data data) {
        if (this.getLiteracy() == data.getLiteracy()) {
            return 0;
        } else if (this.getLiteracy() > data.getLiteracy()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.getGender() + ", " + this.literacy;
    }
}
