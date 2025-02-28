package Exo1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Exo1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Button button = new Button("Click on me !");
        button.setOnMouseClicked(event -> {
            System.out.println("Bonjour, JavaFX !");
        });
        root.getChildren().add(button);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
