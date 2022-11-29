package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    public void start(Stage window) {
        // create fields
        Label instruction = new Label("Enter the name and start");
        Label welcomeText = new Label("Welcome");
        TextField inputField = new TextField();
        Button button = new Button("Start");

        // create layout and place fields
        GridPane mainLayout = new GridPane();
        mainLayout.add(instruction, 0, 0);
        mainLayout.add(inputField, 0, 1);
        mainLayout.add(button, 0, 2);
        
        // create welcome layout
        BorderPane welcomeLayout = new BorderPane();
        welcomeLayout.setCenter(welcomeText);
        welcomeLayout.setPrefSize(300, 200);

        // stylistic of mainLayout
        mainLayout.setPrefSize(300, 200);
        mainLayout.setAlignment(Pos.CENTER);
        
        // setup scenes
        Scene scene = new Scene(mainLayout);
        Scene welcomScene = new Scene(welcomeLayout);

        // setup button behavior
        button.setOnAction((event) -> {
            welcomeText.setText("Welcome " + inputField.getText() + "!");
            window.setScene(welcomScene);
        });

        // initialize window
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
