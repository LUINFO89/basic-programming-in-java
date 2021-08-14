import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public Connection connect() {
        String url = "jdbc:sqlite:C:/Users/LuisSensei/Documents/basic-programming-in-java/Tema6/Sesion17/bd/AlmacenV2.db";
        Connection var = null;
        try {
            var = DriverManager.getConnection(url);
            System.out.println("Me conecte!");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return var;
    }
}
