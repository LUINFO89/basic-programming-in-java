
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
        private TextField identificacionTxt;
    
        @FXML
        private TextField NombreTxt;
    
        @FXML
        private TextField ApellidoTxt;
    
        @FXML
        private TextField GeneroTxt;
    
        @FXML
        private Button addClient;
    
        @FXML
        private ChoiceBox<String> productoCb;
    
        @FXML
        private ChoiceBox<String> clienteCb;
    
        @FXML
        private TextField cantidadTxt;
    
        @FXML
        private Button registrar;
        
        ObservableList<String>Productos =FXCollections.observableArrayList("Seleccione un producto");
        ObservableList<String>Clientes =FXCollections.observableArrayList("Seleccione un cliente");
    
        @FXML
        private void initialize(){
            ListarProducto();
            ListarClientes();
        }
    
        @FXML
        void addClient(MouseEvent event) {
    
            Connect conexion = new Connect();
            int identificacion = Integer.parseInt(identificacionTxt.getText());
            String nombre = NombreTxt.getText();
            String apellido = ApellidoTxt.getText();
            String genero = GeneroTxt.getText();
            String sql = "insert into Clientes (cedula, nombre, apellido, genero) values (?, ?, ?, ?)";
            Connection con3 = conexion.connect();
            try {
                Connection con2 = conexion.connect();
                PreparedStatement stmt = con2.prepareStatement(sql);
                stmt.setInt(1, identificacion);
                stmt.setString(2, nombre);
                stmt.setString(3, apellido);
                stmt.setString(4, genero);
                stmt.executeUpdate();
                System.out.println("Cliente Guardado");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    
        @FXML
        void registrar(MouseEvent event) {
            Integer codigoProducto=Integer.parseInt(retornarNum(productoCb.getValue()));
            Integer codigoCliente=Integer.parseInt(retornarNum(clienteCb.getValue()));
            Integer cant=Integer.parseInt(cantidadTxt.getText());
            Connect con= new Connect();
            String sql="Insert into Ventas(cliente,producto,cantidad) values(?,?,?)";
            try {
                Connection conn=con.connect();
                PreparedStatement s= conn.prepareStatement(sql);
                s.setInt(1,codigoProducto);
                s.setInt(2,codigoCliente);
                s.setInt(3,cant);
                s.executeUpdate();
                System.out.println("venta realizada");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    
    
    
        }
    
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
                productoCb.setItems(Productos);
            } catch (SQLException e) {
                System.out.println("error");
            }
    
        }
    
        public void ListarClientes() {
            Connect con = new Connect();
            String sql="SELECT * FROM Clientes";
            try {
                Connection conn = con.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    Clientes.add(rs.getInt("Id")+"-"+(rs.getString("Nombre")));
                }
                clienteCb.setItems(Clientes);
            } catch (SQLException e) {
                System.out.println("error");
            }
    
        }
    
        public String retornarNum(String texto){
            String[] vector= texto.split("-");
            return vector[0];
        }
}
          
    


