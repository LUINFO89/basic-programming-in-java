package javaConnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Connect {
    public Connection connect()
    {
        String url = "jdbc:sqlite:C:/Users/LuisSensei/Documents/basic-programming-in-java/Tema6/Sesion17_2/Sesion17/src/BaseDatos/AlmacenV2";
        Connection var1 = null;
        try 
        {
            var1 = DriverManager.getConnection(url);
           System.out.println("Conectado!");
        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return var1;
    }
}
