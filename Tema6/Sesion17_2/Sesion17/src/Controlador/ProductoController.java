package Controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javaConnect.Connect;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ProductoController {

    @FXML
    private TextField codigotxt;

    @FXML
    private TextField nombretxt;

    @FXML
    private TextField preciocompratxt;

    @FXML
    private TextField precioventatxt;

    @FXML
    private TextField cantbodegatxt;

    @FXML
    private TextField CminRenBodtxt;

    @FXML
    private TextField CmInventariotxt;

    @FXML
    private TextArea escrituraTxt;

    @FXML
    private Button productosbtn;

    @FXML
    void irVentas(MouseEvent event) {
        try
        {
            FXMLLoader instance = new FXMLLoader(getClass().getResource("../Vista/Ventas.fxml"));
                    Parent cargada = instance.load();
                    Scene loadForm = new Scene(cargada);
                    Stage s1 = new Stage();
                    s1.setScene(loadForm);
                    s1.show();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void ver(MouseEvent event) {
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
            escrituraTxt.setText(productos);
        }catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void insertar(MouseEvent event) {
        Connect conexion = new Connect();
        int codigo = Integer.parseInt(codigotxt.getText());
        String nombre = nombretxt.getText();
        int preciocompra = Integer.parseInt(preciocompratxt.getText());
        int precioventa = Integer.parseInt(precioventatxt.getText());
        int cantbodega = Integer.parseInt(cantbodegatxt.getText());
        int CminRenBod = Integer.parseInt(CminRenBodtxt.getText());
        int CmInventario = Integer.parseInt(CmInventariotxt.getText());
        try
        {
            Connection con1 = conexion.connect();
            Statement statement1 = con1.createStatement();
            statement1.executeUpdate("insert into Productos(Codigo, Nombre, PrecioDeCompra, PrecioDeVenta, CantidadEnBodega, CantMinReqEnBodega, CantMAxInvPermitida) values ("+codigo+", "+"'"+nombre+"'"+", "+preciocompra+", "+precioventa+", "+cantbodega+", "+CminRenBod+","+CmInventario+");");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}


