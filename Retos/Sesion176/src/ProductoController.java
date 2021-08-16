import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Statement;
public class ProductoController {

    @FXML
    private TextField Code;

    @FXML
    private TextField Name;

    @FXML
    private TextField PriceV;

    @FXML
    private TextField PriceC;

    @FXML
    private TextField CantidaB;

    @FXML
    private TextField CantidaMinimaB;

    @FXML
    private TextField CantidaMaximaInventario;

    @FXML
    private TextArea ListProduct;

    @FXML
    private Button VerProductos;

    @FXML
    private Button createSaleButton;

    @FXML
    void createSale(ActionEvent event) {
        //boton vista ventas 
        try {
            FXMLLoader instancia = new FXMLLoader(getClass().getResource("Vistas/registroVenta.fxml"));
            Parent cargada = instancia.load();
            Scene loadForm = new Scene(cargada);
            Stage s1 = new Stage();
            s1.setScene(loadForm);
            s1.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void VerProductos(ActionEvent event) {
        //boton para hacer el selected consulta Query
        Connect conexion = new Connect();
        String sql = "select * from Productos";
        try
        {
            Connection con2 = conexion.connect();
            Statement segunda = con2.createStatement();
            ResultSet rs = segunda.executeQuery(sql);
            ResultSetMetaData rmd = rs.getMetaData();
            int columnas = rmd.getColumnCount();
            String productos = "";
            while (rs.next())
            {
                for (int i = 1; i < columnas; i++)
                {
                    String valorColumna = rs.getString(i);
                    productos = productos + rmd.getColumnName(i) + valorColumna + "\n";
                }
                productos += "\n";
            }
            ListProduct.setText(productos);
        }catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void BtnCreateProduct(ActionEvent event) {

        Connect conexion = new Connect();
        int Codigo = Integer.parseInt(Code.getText()); 
        String Nombre = Name.getText();
        int PrecioDeCompra = Integer.parseInt(PriceC.getText());
        int PrecioDeVenta = Integer.parseInt(PriceV.getText());
        int CantidadEnBodega = Integer.parseInt(CantidaB.getText());
        int CantiMiniReqBodega= Integer.parseInt(CantidaMinimaB.getText());
        int CantiMaxiReqBodega = Integer.parseInt(CantidaMaximaInventario.getText());

        try {
            Connection con1 = conexion.connect();
            Statement stament1 = con1.createStatement();
            stament1.executeUpdate("INSERT INTO Productos(Codigo, Nombre, PrecioDeCompra, PrecioDeVenta, CantidadEnBodega, CantiMiniReqBodega, CantiMaxiReqBodega) VALUES ("+Codigo+", "+"'"+Nombre+"'"+", "+PrecioDeCompra+", "+PrecioDeVenta+", "+CantidadEnBodega+", "+CantiMiniReqBodega+", "+CantiMaxiReqBodega+");");
            System.out.println("Producto creado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



}
