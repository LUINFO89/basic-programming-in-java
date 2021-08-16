import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        FXMLLoader instance = new FXMLLoader(getClass().getResource("Vista/test.fxml"));
        Parent cargada = instance.load();
        Scene loadForm = new Scene(cargada);
        arg0.setScene(loadForm);
        arg0.show();
    }
}
