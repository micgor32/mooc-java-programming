package application;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.chart.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.util.HashMap;
import java.util.Map;

public class SavingsCalculatorApplication extends Application {
    public void start(Stage window) {
        BorderPane userInterface = new BorderPane();

        // add charts
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setAnimated(false);
        userInterface.setCenter(lineChart);

        VBox sliders = new VBox();
        sliders.setSpacing(10);
        sliders.setPadding(new Insets(10, 10, 10, 10));

        BorderPane first = new BorderPane();
        first.setPadding(new Insets(10, 10, 10, 10));

        Label textFirst = new Label("Monthly savings");
        first.setLeft(textFirst);

        Slider sliderFirst = new Slider(25, 250, 25);
        sliderFirst.setShowTickMarks(true);
        sliderFirst.setShowTickLabels(true);

        first.setCenter(sliderFirst);

        Label descriptionFirst = new Label();

        first.setRight(descriptionFirst);
        sliderFirst.valueProperty().addListener(
                (obs, old, newval) -> {

                    int i = newval.intValue();
                    descriptionFirst.setText(Integer.toString(i));

                    lineChart.getData().clear();

                    Map<Integer, Integer> data = new HashMap<>();
                    XYChart.Series xyData = new XYChart.Series();

                    firstSlideData(i, data);

                    data.entrySet().stream().forEach(pair -> {
                        xyData.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
                    });

                    xyData.setName("");

                    lineChart.getData().add(xyData);
                });

        BorderPane second = new BorderPane();
        second.setPadding(new Insets(10, 10, 10, 10));

        Label textSecond = new Label("Yearly interest rate");
        second.setLeft(textSecond);

        Slider sliderSecond = new Slider(0, 10, 0.1);
        sliderSecond.setShowTickLabels(true);
        second.setCenter(sliderSecond);

        Label descriptionSecond = new Label();
        second.setRight(descriptionSecond);

        sliderSecond.valueProperty().addListener(
                (obs, old, newval) -> {
                    double i = Math.floor(newval.doubleValue() * 100) / 100;
                    descriptionSecond.setText(Double.toString(i));

                    int amount = (int) sliderFirst.valueProperty().get();

                    Map<Integer, Double> dataSecond = new HashMap<>();
                    Map<Integer, Integer> data = new HashMap<>();

                    XYChart.Series xyData = new XYChart.Series();
                    XYChart.Series xyDataSecond = new XYChart.Series();

                    lineChart.getData().clear();

                    firstSlideData(amount, data);
                    secondSlideData(i, amount, dataSecond);

                    data.entrySet().stream().forEach(pair -> {
                        xyData.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
                    });

                    dataSecond.entrySet().stream().forEach(pair -> {
                        xyDataSecond.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
                    });

                    xyData.setName("");
                    xyDataSecond.setName("");

                    lineChart.getData().add(xyData);
                    lineChart.getData().add(xyDataSecond);
                });
                
        sliders.getChildren().add(first);
        sliders.getChildren().add(second);

        userInterface.setTop(sliders);

        Scene scene = new Scene(userInterface);

        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    private void firstSlideData(int amount, Map<Integer, Integer> data) {
        for (int i = 0; i < 31; i++) {
            int actualX = i;
            int actualY = (i * 12) * amount;
            if (data.containsKey(i)) {
                data.remove(i);
            }
            data.put(actualX, actualY);
        }
    }

    private void secondSlideData(double interest, int amount, Map<Integer, Double> data) {
        double total = 0;
        int sumToAdd = 12 * amount;

        for (int i = 0; i < 31; i++) {
            int actualX = i;

            if (i != 0) {
                total = total + sumToAdd;
                double Int = calcInt(total, interest);
                total += Int;
            }

            data.put(actualX,total);
        }
    }

    private double calcInt(double sum, double interest) {
        double valInt = (sum * interest) / 100;

        return valInt;
    }
}