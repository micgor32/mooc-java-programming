import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        LicensePlate compared = (LicensePlate) object;
        boolean result = (this.liNumber == compared.liNumber && this.country == compared.country);
        return result;
    }

    public int hashCode() {
        return Objects.hash(this.country, this.liNumber);
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
