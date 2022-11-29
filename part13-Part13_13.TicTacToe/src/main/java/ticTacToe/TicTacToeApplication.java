package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    private Button[] buttons;
    private boolean xturn = true;
    private boolean finished = false;
    private Label turn = new Label("Turn: X");

    @Override
    public void start(Stage window) {
        // create components
        BorderPane layout = new BorderPane();
        layout.setPrefSize(300, 280);
        Label end = new Label("game has ended");
        this.buttons = new Button[9];

        // create buttons, set fonts and define behavior
        for (int i = 0; i < 9; i++) {
            buttons[i] = newButton();
        }

        GridPane buttonsLayout = new GridPane();
        buttonsLayout.setHgap(10);
        buttonsLayout.setVgap(10);
        buttonsLayout.add(buttons[0], 1, 0);
        buttonsLayout.add(buttons[1], 2, 0);
        buttonsLayout.add(buttons[2], 3, 0);
        buttonsLayout.add(buttons[3], 1, 1);
        buttonsLayout.add(buttons[4], 2, 1);
        buttonsLayout.add(buttons[5], 3, 1);
        buttonsLayout.add(buttons[6], 1, 3);
        buttonsLayout.add(buttons[7], 2, 3);
        buttonsLayout.add(buttons[8], 3, 3);

        layout.setTop(this.turn);
        layout.setCenter(buttonsLayout);

        // add buttons behavior
        // buttons.setOnAction()

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();

    }

    private Button newButton() {
        Button button = new Button(" ");
        button.setFont(Font.font("Monospaced", 40));
        button.setOnAction((event) -> {
            if (this.finished) {
                return;
            }

            if (!button.getText().equals(" ")) {
                return;
            }

            if (this.xturn) {
                this.turn.setText("Turn: O");
                button.setText("X");
                this.xturn = false;
            } else {
                this.turn.setText("Turn: X");
                button.setText("O");
                this.xturn = true;
            }
            if (isFinished() || isScratched()) {
                this.turn.setText("The end!");
                this.finished = true;
            }
        });

        return button;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    private boolean isFinished() {
        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[1].getText()) && buttons[0].getText().equals(buttons[2].getText())) {
                this.finished = true;
            }
        }
        if (!buttons[3].getText().equals(" ")) {
            if (buttons[3].getText().equals(buttons[4].getText()) && buttons[3].getText().equals(buttons[5].getText())) {
                this.finished = true;
            }
        }
        if (!buttons[6].getText().equals(" ")) {
            if (buttons[6].getText().equals(buttons[7].getText()) && buttons[6].getText().equals(buttons[8].getText())) {
                this.finished = true;
            }
        }

        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[3].getText()) && buttons[0].getText().equals(buttons[6].getText())) {
                this.finished = true;
            }
        }
        if (!buttons[1].getText().equals(" ")) {
            if (buttons[1].getText().equals(buttons[4].getText()) && buttons[1].getText().equals(buttons[7].getText())) {
                this.finished = true;
            }
        }
        if (!buttons[2].getText().equals(" ")) {
            if (buttons[2].getText().equals(buttons[5].getText()) && buttons[2].getText().equals(buttons[8].getText())) {
                this.finished = true;
            }
        }

        if (!buttons[0].getText().equals(" ")) {
            if (buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText())) {
                this.finished = true;
            }
        }
        if (!buttons[2].getText().equals(" ")) {
            if (buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText())) {
                this.finished = true;
            }
        }

        return false;
    }

    private boolean isScratched() {
        if (!buttons[0].getText().equals(" ") &&
            !buttons[1].getText().equals(" ") &&
            !buttons[2].getText().equals(" ") &&
            !buttons[3].getText().equals(" ") &&
            !buttons[4].getText().equals(" ") &&
            !buttons[5].getText().equals(" ") &&
            !buttons[6].getText().equals(" ") &&
            !buttons[7].getText().equals(" ") &&
            !buttons[8].getText().equals(" ")) {
            return true;
        }
        return false;
    }
} 