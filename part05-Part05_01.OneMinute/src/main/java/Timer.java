public class Timer {
    private ClockHand seconds;
    private ClockHand hundreths;    

    public Timer() {
       this.hundreths = new ClockHand(100);
       this.seconds = new ClockHand(60);

    }

    public void advance() {
        this.hundreths.advance();

        if (this.hundreths.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        /*if (this.seconds < 10 && this.hundreths < 10) {
            return "0" + String.valueOf(this.seconds) + ":" + "0" + String.valueOf(this.hundreths);
        } else if (this.seconds < 10 && this.hundreths >= 10) {
            return "0" + String.valueOf(this.seconds) + ":" + String.valueOf(this.hundreths);
        } else {
            return String.valueOf(this.seconds) + ":" + String.valueOf(this.hundreths);
        } */

        return this.seconds.toString() + ":" + this.hundreths.toString();
    }
}
