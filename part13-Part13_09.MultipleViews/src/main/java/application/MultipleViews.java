package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    public void start(Stage window) {
        // First window
        BorderPane firstLayout = new BorderPane();
        Button toSecond = new Button("To the second view!");
        Label firstLabel = new Label("First view!");
        firstLayout.setTop(firstLabel);
        firstLayout.setCenter(toSecond);

        // Second window
        VBox secondLayout = new VBox();
        Button toThird = new Button("To the third view!");
        Label secondLabel = new Label("Second view!");
        secondLayout.getChildren().addAll(toThird, secondLabel);

        // Third window
        GridPane thirdLayout = new GridPane();
        Label thirdLabel = new Label("Third view!");
        Button toFirst = new Button("To the first view");
        GridPane.setConstraints(thirdLabel, 0, 0);
        GridPane.setConstraints(toFirst, 0, 1);
        thirdLayout.getChildren().addAll(thirdLabel, toFirst);

        // create scenes
        Scene firstScene = new Scene(firstLayout);
        Scene secondScene = new Scene(secondLayout);
        Scene thirdScene = new Scene(thirdLayout);

        // setup button behavior
        toSecond.setOnAction((event) -> {
            window.setScene(secondScene);
        });

        toThird.setOnAction((event) -> {
            window.setScene(thirdScene);
        });

        toFirst.setOnAction((event) -> {
            window.setScene(firstScene);
        });

        // initialize window
        window.setScene(firstScene);
        window.show();
    }
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}
