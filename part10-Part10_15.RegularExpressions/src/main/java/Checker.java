

public class Checker {
    private String regex;
    private String vovels;

    public Checker() {
        this.regex = "mon|tue|wed|thu|fri|sat|sun";
        this.vovels = "[aeiou]*|aeiou";
    }

    public boolean isDayOfWeek(String string) {
        if (string.matches(this.regex)) {
            return true;
        }

        return false;
    }

    public boolean allVowels(String string) {
        if (string.matches(this.vovels)) {
            return true;
        }

        return false;
    }

    public boolean timeOfDay(String string){
        return string.matches("([0-1][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]");
    }
}
