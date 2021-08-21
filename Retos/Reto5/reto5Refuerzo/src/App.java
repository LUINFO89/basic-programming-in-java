import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class App extends Application {

@Override
public void start(Stage primaryStage) throws Exception {
FXMLLoader fxmlLoader = new

FXMLLoader(getClass().getResource("layout.fxml"));

Parent root = fxmlLoader.load();
Scene scene = new Scene(root, 800, 850);
scene.getRoot().setStyle("-fx-font-family: 'serif'");

primaryStage.setTitle("Reto de refuerzo");
primaryStage.setScene(scene);
primaryStage.show();
}

public static void main(String[] args) {
launch(args);
}
}