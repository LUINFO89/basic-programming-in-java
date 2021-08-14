import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class RegistroVentaController {

    @FXML
    private ChoiceBox<?> SeleccinaProducto;

    @FXML
    private ChoiceBox<?> SeleccionaCliente;

    @FXML
    private TextField Cantidad;

    @FXML
    private Button RegistroBtn;

    @FXML
    private TextField IdentificacionCliente;

    @FXML
    private TextField NombreCliente;

    @FXML
    private TextField ApellidoCliente;

    @FXML
    private TextField GeneroCliente;

    @FXML
    private Button AñadirCliente;

    @FXML
    void AgregarCliente(ActionEvent event) {
        Connect conexion = new Connect();
        int identificacion = Integer.parseInt(IdentificacionCliente.getText());
        String Nombre = NombreCliente.getText();
        String Apellido = ApellidoCliente.getText();
        String Genero = GeneroCliente.getText();
        String sql = "insert into CLIENTES (cedula,nombre,apellido,genero) values (? ,? ,? ,? )";
        Connection con3 = conexion.connect();

        try {
            Connection con2 = conexion.connect();
            PreparedStatement stmt = con2.prepareStatement(sql);
            stmt.setInt(1, identificacion);
            stmt.setString(2, Nombre);
            stmt.setString(3, Apellido);
            stmt.setString(4, Genero);
            stmt.executeUpdate();
            System.out.println("Clientes Guardados");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }

    @FXML
    void registrobtn(ActionEvent event) {

    }

}
