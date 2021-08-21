import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            String url = "/Users/luis/basic-programming-in-java/Retos/Reto5/reto5/src/db/database.db"; // Aqui debe indicar la ruta absoluta hasta el archivo 'database.db'
            conn = DriverManager.getConnection("jdbc:sqlite:" + url);
        }catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos/n" + ex.getMessage());
        }
        return conn;
    }
}
