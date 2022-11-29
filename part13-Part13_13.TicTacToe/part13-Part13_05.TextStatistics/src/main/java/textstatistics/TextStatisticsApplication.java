package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {
    public void start(Stage window) {
        BorderPane main = new BorderPane();
        HBox textBox = new HBox();
        textBox.setSpacing(10);
        textBox.getChildren().add(new Label("Letters: 0"));
        textBox.getChildren().add(new Label("Words: 0"));
        textBox.getChildren().add(new Label("The longest word is:"));
        main.setCenter(new TextArea());
        main.setBottom(textBox);

        Scene view = new Scene(main);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
