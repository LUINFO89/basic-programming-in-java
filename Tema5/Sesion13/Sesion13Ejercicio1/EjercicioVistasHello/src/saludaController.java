import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class saludaController {

    @FXML
    private AnchorPane saluda;

    @FXML
    private Button button;

    @FXML
    void button(ActionEvent event) {
        System.out.println("Hola Mundo");
        
    }

    

}
