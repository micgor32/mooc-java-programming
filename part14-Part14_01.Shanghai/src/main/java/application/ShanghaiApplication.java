package application;

import javafx.application.*;
import javafx.scene.chart.*;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class ShanghaiApplication extends Application {
    public void start(Stage window) {
        NumberAxis yAxis = new NumberAxis(0, 100, 1);
        NumberAxis xAxis = new NumberAxis(2007, 2017, 1);

        yAxis.setLabel("Ranking");
        xAxis.setLabel("Year");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        XYChart.Series dataSeries = new XYChart.Series();
        dataSeries.getData().add(new XYChart.Data(2007, 73));
        dataSeries.getData().add(new XYChart.Data(2008, 68));
        dataSeries.getData().add(new XYChart.Data(2009, 72));
        dataSeries.getData().add(new XYChart.Data(2010, 72));
        dataSeries.getData().add(new XYChart.Data(2011, 74));
        dataSeries.getData().add(new XYChart.Data(2012, 73));
        dataSeries.getData().add(new XYChart.Data(2013, 76));
        dataSeries.getData().add(new XYChart.Data(2014, 73));
        dataSeries.getData().add(new XYChart.Data(2015, 67));
        dataSeries.getData().add(new XYChart.Data(2016, 56));
        dataSeries.getData().add(new XYChart.Data(2017, 56));

        lineChart.getData().add(dataSeries);

        Scene view = new Scene(lineChart);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
