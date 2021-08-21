
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class RegistroVentaController {

    @FXML
    private ChoiceBox<String> SeleccinaProducto;

    @FXML
    private ChoiceBox<String> SeleccionaCliente;

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
    private void initialize(){
        ListarProducto();
        ListarClientes();
        
    }
  
    ObservableList<String>Productos =FXCollections.observableArrayList("Seleccione un producto");
    ObservableList<String>Clientes =FXCollections.observableArrayList("Seleccione un cliente");
    @FXML
    void AgregarCliente(MouseEvent event) {
        Connect conexion = new Connect();
        int identificacion = Integer.parseInt(IdentificacionCliente.getText());
        String Nombre = NombreCliente.getText();
        String Apellido = ApellidoCliente.getText();
        String Genero = GeneroCliente.getText();
        String sql = "insert into CLIENTES (cedula,nombre,apellido,genero) values (? ,? ,? ,? )";
        //Connection con3 = conexion.connect();

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
    void registrobtn(MouseEvent event) {

    }
    // buena practica listar los productos
    //primero crear la instancia de la base de datos
    //segundo hacer la consulata a la base de datos 
    //tercero stategmen traer los cantDatos
    // recorrer la base dedatos y conactenar Query
    public void ListarProducto() {
        Connect con = new Connect();
        String sql="SELECT * FROM productos";
        try {
            Connection conn = con.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Productos.add(rs.getInt("Codigo")+"-"+(rs.getString("Nombre")));
            }
            SeleccinaProducto.setItems(Productos);
        } catch (SQLException e) {
            System.out.println("error");
        }

    }
    public void ListarClientes() {
        Connect concl = new Connect();
        String sql="SELECT * FROM Clientes";
        try {
            Connection conncl = concl.connect();
            Statement stmt = conncl.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Clientes.add(rs.getInt("id")+"-"+(rs.getString("cedula")+"-"+(rs.getString("nombre"))));
            }
            SeleccionaCliente.setItems(Clientes);
        } catch (SQLException e) {
            System.out.println("error");
        }

    }
        
    

}
