package Exo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Exo2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label numberLabel = new Label("0");
        Button plusBtn = new Button("+");
        Button minusBtn = new Button("-");

        plusBtn.setOnMouseClicked(e -> {
            numberLabel.setText(Integer.toString(Integer.parseInt(numberLabel.getText()) + 1));
        });
        minusBtn.setOnMouseClicked(e -> {
            numberLabel.setText(Integer.toString(Integer.parseInt(numberLabel.getText()) - 1));
        });
        HBox hBox = new HBox(minusBtn, plusBtn);
        hBox.setSpacing(10);
        VBox root = new VBox(10, numberLabel, hBox);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
