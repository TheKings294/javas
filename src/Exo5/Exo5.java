package Exo5;

import Exo3.Exo3;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Exo5 extends Application {
    @FXML
    private ComboBox<String> MyComboBox;
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/ComboBox.fxml"));
            Pane root = loader.load();

            if (MyComboBox != null) {
                MyComboBox.getItems().addAll("Paris", "Londres", "Moscow", "Washington DC", "Madrid", "Rome");
            } else {
                System.out.println("Error");
            }
            Scene scene = new Scene(root, 600, 400);

            primaryStage.setTitle("JavaFX Test");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
