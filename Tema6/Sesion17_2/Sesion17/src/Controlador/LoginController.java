package Controlador;
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
    private TextField usuarioTxt;

    @FXML
    private PasswordField passwordTxt;

    @FXML
    private Button iniciarBtn;

    @FXML
    private Label mensajeTxt;

    @FXML
    void iniciar(MouseEvent event) 
    {
        try
        {
            String usu = usuarioTxt.getText();
            String pass = passwordTxt.getText();
            if (usu.equalsIgnoreCase("Prueba"))
            {
                mensajeTxt.setText("Invalid User");
            }else if (pass.length()<6)
            {
                mensajeTxt.setText("Password too short");
            }else if (pass.equals(usu))
            {
                mensajeTxt.setText("Password and User can't be the same");
            }else
            {
                FXMLLoader instance = new FXMLLoader(getClass().getResource("../Vista/InsertProduct.fxml"));
                Parent cargada = instance.load();
                Scene loadForm = new Scene(cargada);
                Stage s1 = new Stage();
                s1.setScene(loadForm);
                s1.show();
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }



}
