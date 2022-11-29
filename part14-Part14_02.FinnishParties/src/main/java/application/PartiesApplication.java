package application;

import java.nio.file.Paths;
import java.util.Scanner;

import javafx.application.*;
import javafx.scene.chart.*;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class PartiesApplication extends Application {
    public void start(Stage window) {
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        try (Scanner getFile = new Scanner(Paths.get("partiesdata.tsv"))) {
            while (getFile.hasNextLine()) {
                String fromFile = getFile.nextLine();
                String[] parts = fromFile.split("\t");

                if (parts[0].equals("Party")) {
                    continue;
                } else {
                    lineChart.getData().add(getData(parts));
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Scene view = new Scene(lineChart);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    private XYChart.Series getData(String[] parts) {
        XYChart.Series partyData = new XYChart.Series();

        partyData.setName(parts[0]);
        partyData.getData().add(new XYChart.Data(1968, checkValue(parts[1]))); 
        partyData.getData().add(new XYChart.Data(1972, checkValue(parts[2])));
        partyData.getData().add(new XYChart.Data(1976, checkValue(parts[3])));
        partyData.getData().add(new XYChart.Data(1980, checkValue(parts[4])));
        partyData.getData().add(new XYChart.Data(1984, checkValue(parts[5])));
        partyData.getData().add(new XYChart.Data(1988, checkValue(parts[6])));
        partyData.getData().add(new XYChart.Data(1992, checkValue(parts[7])));
        partyData.getData().add(new XYChart.Data(1996, checkValue(parts[8])));
        partyData.getData().add(new XYChart.Data(2000, checkValue(parts[9])));
        partyData.getData().add(new XYChart.Data(2004, checkValue(parts[10])));
        partyData.getData().add(new XYChart.Data(2008, checkValue(parts[11])));

        return partyData;
    }

    private double checkValue(String parts) {
        if (parts.equals("-")) {
            return 0;
        }

        return Double.valueOf(parts);
    }
}
