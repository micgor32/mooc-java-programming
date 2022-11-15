package application;

public class StandardSensor implements Sensor {
    private int sensorValue;

    public StandardSensor(int value) {
        this.sensorValue = value;
    }

    public void setOff() {
        // no effect
    }

    public void setOn() {
        //no effect
    }

    public int read() {
        return this.sensorValue;
    }

    public boolean isOn() {
        return true;
    }
}
