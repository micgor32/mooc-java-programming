package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class NotifierApplication extends Application {
    public void start(Stage window) {
        VBox layoutBox = new VBox();
        TextField textBox = new TextField();
        Button button = new Button("Update");
        Label text = new Label();

        layoutBox.getChildren().addAll(textBox, button, text);

        Scene show = new Scene(layoutBox);

        button.setOnAction((event) ->{
            text.setText(textBox.getText());
        });

        window.setScene(show);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
