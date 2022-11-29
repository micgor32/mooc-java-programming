package application;

import application.Dictionary;
import application.FirstView;
import application.SecondView;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    private Dictionary dict = new Dictionary();

    public void start(Stage window) {
        // initialize all fields
        BorderPane mainLayout = new BorderPane();
        HBox menu = new HBox(); 
        FirstView fView = new FirstView(dict);
        Button enterWords = new Button("Enter new words");
        Button practice = new Button("Practice");
        SecondView sView = new SecondView(dict);

        // add elements to layout
        menu.getChildren().addAll(enterWords, practice);
        mainLayout.setTop(menu);

        // set button behavior
        enterWords.setOnAction((event) -> mainLayout.setCenter(fView.getView()));
        practice.setOnAction((event) -> mainLayout.setCenter(sView.getView()));

        mainLayout.setCenter(fView.getView());
        Scene scene = new Scene(mainLayout);

        // show scene
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
}
