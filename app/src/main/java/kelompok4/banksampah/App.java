package kelompok4.banksampah;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Button
        Button button = new Button("Click Me!");

        // Create a StackPane layout
        StackPane root = new StackPane();
        root.getChildren().add(button);

        // Create a Scene and add the layout to it
        Scene scene = new Scene(root, 300, 250);

        // Set the Scene to the Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Simple GUI");

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
