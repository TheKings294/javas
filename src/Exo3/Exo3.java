package Exo3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Exo3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        TextField field = new TextField("Enter your name");
        Label label = new Label("Your name :");

        field.textProperty().addListener((observable, oldValue, newValue) -> {
            label.setText("Your name : " + newValue);
        });

        root.getChildren().add(field);
        root.getChildren().add(label);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
