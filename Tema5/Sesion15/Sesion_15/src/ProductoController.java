import java.sql.Connection;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
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
