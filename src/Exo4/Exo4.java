package Exo4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Exo4 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Background bkRed = new Background(new BackgroundFill(Color.rgb(255, 0, 0), null, null));
        Background bkGreen = new Background(new BackgroundFill(Color.rgb(0, 255, 0), null, null));
        Background bkBlue = new Background(new BackgroundFill(Color.rgb(0, 0, 255), null, null));

        Button redBtn = new Button("Red");
        Button blueBtn = new Button("Blue");
        Button greenBtn = new Button("Green");

        HBox root = new HBox(20, redBtn, blueBtn, greenBtn);
        Scene scene = new Scene(root, 400, 300);

        redBtn.setOnMouseClicked((event) -> {
            root.setBackground(bkRed);
        });
        blueBtn.setOnMouseClicked((event) -> {
            root.setBackground(bkBlue);
        });
        greenBtn.setOnMouseClicked((event) -> {
            root.setBackground(bkGreen);
        });

        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
