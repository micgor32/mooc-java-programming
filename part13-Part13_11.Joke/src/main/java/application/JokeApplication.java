package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JokeApplication extends Application {
    public void start(Stage window) {
        // create fields
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button expln = new Button("Explanation");
        GridPane layout = new GridPane();
        Label text = new Label("What do you call a bear with no teeth?");
        
        // add elements to the layout
        layout.add(joke, 0, 0);
        layout.add(answer, 1, 0);
        layout.add(expln, 2, 0);
        layout.add(text, 1, 2);

        answer.setOnAction((event) -> {
            text.setText("A gummy bear.");
        });

        joke.setOnAction((event) -> {
            text.setText("What do you call a bear with no teeth?");
        });

        expln.setOnAction((event) -> {
            text.setText("testowy joke");
        });

        // start window
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
