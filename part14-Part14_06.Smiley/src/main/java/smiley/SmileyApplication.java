package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class SmileyApplication extends Application {
    public void start(Stage windows) {
        BorderPane main = new BorderPane();
        Canvas painting = new Canvas(480, 480);
        GraphicsContext painter = painting.getGraphicsContext2D();

        painter.setFill(Color.BLACK);
        painter.fillRect(120, 120, 50, 50);
        painter.fillRect(320, 120, 50, 50);
        painter.fillRect(120, 360, 250, 50);
        painter.fillRect(70, 310, 50, 50);
        painter.fillRect(370, 310, 50, 50);

        main.setCenter(painting); 

        Scene scene = new Scene(main);
        windows.setScene(scene);
        windows.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
}
