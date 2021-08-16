import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usertxt;

    @FXML
    private Button idInitBtn;

    @FXML
    private PasswordField passtxt;

    @FXML
    private Label mensaje;

    @FXML
    void start(MouseEvent event) {
        try {
            String usuario = usertxt.getText();
            String contraseña = passtxt.getText();
            if(usuario.equalsIgnoreCase("prueba")){
                mensaje.setText("Usuario no válido");
            }else if( contraseña.length()<6){
                mensaje.setText("La contraseña debe ser mayor a 6 caracteres . Intente nuevamente ");
            }else if( usuario.toLowerCase() == contraseña.toLowerCase()){
                mensaje.setText("La contraseña debe diferente a usuario.Intente nuevamente ");
            }else {
                mensaje.setText("");
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Vistas/SYSTEM.fxml"));
                Parent root = fxmlLoader.load();
                Scene scene = new Scene(root);
                Stage secondStage = new Stage();
                secondStage.setTitle("Systema de notas");
               ;
                secondStage.setScene(scene);
                secondStage.show();

               
            }

        } catch (Exception e) {
            System.out.println("Error");
        } 

    }
}
