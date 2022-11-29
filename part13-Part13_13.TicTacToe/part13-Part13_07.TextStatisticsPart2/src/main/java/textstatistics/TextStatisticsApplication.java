package textstatistics;

import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {
    public void start(Stage window) {
        BorderPane main = new BorderPane();
        Label letters = new Label("Letters: ");
        Label words = new Label("Words: ");
        Label longest = new Label("The longest word is: ");
        HBox textBox = new HBox();
        TextArea textArea = new TextArea();
        textBox.setSpacing(10);

        textBox.getChildren().add(letters);
        textBox.getChildren().add(words);
        textBox.getChildren().add(longest);
        main.setCenter(textArea);
        main.setBottom(textBox);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int numOfWords = parts.length;
            String longestWord = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();
        
            letters.setText("Letters: " + characters);
            words.setText("Words: "+ numOfWords);
            longest.setText("The longest word is: " + longestWord);
        });
        
        Scene view = new Scene(main);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}