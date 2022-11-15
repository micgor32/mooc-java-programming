package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;    

    public TemperatureSensor() {
        this.isOn = false;
    }

    public void setOn() {
        this.isOn = true;
    }

    public void setOff() {
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public int read() {
        if (this.isOn = false) {
            throw new IllegalStateException();
        }
        
        return new Random().nextInt(30 + 1 + 30) - 30;
    }
}