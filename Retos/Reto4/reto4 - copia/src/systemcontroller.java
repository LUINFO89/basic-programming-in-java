import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class systemcontroller {

    @FXML
    private TextField Nametxt;

    @FXML
    private Label Materia;

    @FXML
    private TextField Subjecttxt;

    @FXML
    private TextField Gradetxt;

    @FXML
    private Label Materia1;

    @FXML
    private TextField Gendertxt;

    @FXML
    private Button saveBtn;

    @FXML
    private Button cargarbtn;

    @FXML
    private TextArea verdatos;

    @FXML
    private TextArea calcular;

    @FXML
    private Button procesarbtn;

    @FXML
    private TextField NombreConsultatxt;

    @FXML
    private TextField MateriaConsultatxt;

    @FXML
    private Button Consultbtn;

    @FXML
    private Button Eliminarbtn;

    @FXML
    void Eliminarbtn(ActionEvent event) {

    }

    @FXML
    void cargarbtn(ActionEvent event) {

    }

    @FXML
    void procesarbtn(ActionEvent event) {

    }

    @FXML
    void saveBtn(ActionEvent event) {
        Connect conexion = new Connect();
        String Nombre = Nametxt.getText();
        String Materia = Subjecttxt.getText();
        String Genero = Gendertxt.getText();
        int Nota = Integer.parseInt(Gradetxt.getText());
        
        String sql = "INSERT INTO GRADES (NAME,SUBJECT,GENDER,GRADE) values (? ,? ,? ,? )";
        //Connection con3 = conexion.connect();

        try {
            Connection con2 = conexion.connect();
            PreparedStatement stmt = con2.prepareStatement(sql);
            stmt.setString(1, Nombre);
            stmt.setString(2, Materia);
            stmt.setString(3, Genero);
            stmt.setInt(4, Nota);
            stmt.executeUpdate();
            System.out.println("Alumno Creado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    

}
