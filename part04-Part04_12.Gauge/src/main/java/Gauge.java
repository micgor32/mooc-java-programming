import javax.swing.text.StyledEditorKit.BoldAction;

public class Gauge {
    private int value;
    
    public void increase() {
        if (this.value < 5) {
            this.value = value + 1;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            this.value = value - 1;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        if (this.value == 5) {
            return true;
        }
        return false;
    }
}
