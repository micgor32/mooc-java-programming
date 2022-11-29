package application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

public class SecondView {
    private Dictionary dict;
    private String word;

    public SecondView(Dictionary dict) {
        this.dict = dict;
        this.word = dict.getRandom();
    }

    public Parent getView() {
        // create fields
        Label wordToTranslate = new Label("Translate the word '" + this.word + "'");
        TextField field = new TextField();
        Button check = new Button("Check");
        Label result = new Label("");
        VBox layout = new VBox();

        // add elements
        layout.setSpacing(30);
        layout.getChildren().addAll(wordToTranslate, field, check);

        check.setOnAction((event) -> {
            String translation = field.getText();
            if (this.dict.get(this.word).equals(translation)) {
                result.setText("Correct!");
            } else {
                result.setText("Incorrect! The translation fo the word '" + this.word + "' is '" + this.dict.get(word) + "'.");
                return;
            }
            this.word = this.dict.getRandom();
            wordToTranslate.setText("Translate the word '" + this.word + "'");
            field.clear();
        });

        return layout;
    }
}