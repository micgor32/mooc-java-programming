package application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

public class FirstView {
    private Dictionary dict;

    public FirstView(Dictionary dict) {
        this.dict = dict;
    }

    public Parent getView() {
        // create fields
        Label wordLabel = new Label("Word:");
        TextField wordField = new TextField();
        Label translationLabel = new Label("Translation");
        TextField transField = new TextField();
        Button add = new Button("Add the word pair");
        VBox layout = new VBox();

        // add elements
        layout.setSpacing(30);
        layout.getChildren().addAll(wordLabel, wordField, translationLabel, transField, add);

        add.setOnAction((event) -> {
            String word = wordField.getText();
            String translation = transField.getText();

            dict.add(word, translation);
            wordField.clear();
            transField.clear();
        });

        return layout;
    }
}
