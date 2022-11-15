import java.util.HashMap;
import java.util.Objects;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    public int hashCode() {
        //return this.day + Integer.valueOf(this.month).hashCode();
        //int hashForDateStr = this.day + this.month + this.year;
        //return Integer.valueOf(hashForDateStr).hashCode();
        /*SimpleDate hsh = new SimpleDate(this.day, this.month, this.year);
        return hsh.hashCode(); */
        //return Objects.hashCode(getClass());

        int hash = 17;

        int day = 31 * hash + this.day;

        int month = 31 * hash + this.month;

        int year = 31 * hash + this.year; 

        return Objects.hash(day, month, year);
    }
}
