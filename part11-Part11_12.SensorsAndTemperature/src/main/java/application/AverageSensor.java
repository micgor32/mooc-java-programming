package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensorsList;
    private List<Integer> values;

    public AverageSensor() {
        this.sensorsList = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        if (!sensorsList.contains(toAdd)) {
            sensorsList.add(toAdd);
        }
    }

    public void setOff() {
        for (Sensor sensor : sensorsList) {
            sensor.setOff();
        }
    }

    public void setOn() {
        for (Sensor sensor : sensorsList) {
            sensor.setOn();
        }
    }

    public int read() {
        int count = 0;
        int value = 0;

        if (sensorsList.isEmpty()) {
            throw new IllegalStateException();
        }

        if (this.isOn() == false) {
            throw new IllegalStateException("to gowno");
        }

        for (Sensor sensor : sensorsList) {
            value += sensor.read();
            count += 1;
            //this.values.add(sensor.read());
        }

        int average = value / count;
        this.values.add(average);

        return average;
    }
    
    public boolean isOn() {
        boolean check = false;

        for (Sensor sensor : sensorsList) {
            if (sensor.isOn() == true) {
                check = true;
            } else if (sensor.isOn() == false) {
                check = false;
            }
        }

        return check;
    }

    public List<Integer> readings() {
        /*for (Sensor sensor : sensorsList) {
            this.values.add(sensor.read());
        } */

        return this.values;
    }
}
