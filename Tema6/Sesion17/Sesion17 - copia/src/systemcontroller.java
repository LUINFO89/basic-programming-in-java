import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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

                //boton para hacer el selected consulta Query
        Connect conexion = new Connect();
        String sql = "select * from Grades";
        try
        {
            Connection con2 = conexion.connect();
            Statement segunda = con2.createStatement();
            ResultSet rs = segunda.executeQuery(sql);
            ResultSetMetaData rmd = rs.getMetaData();
            int columnas = rmd.getColumnCount();
            String datos = "";
            while (rs.next())
            {
                for (int i = 1; i < columnas; i++)
                {
                    String valorColumna = rs.getString(i);
                    datos = datos + rmd.getColumnName(i) + valorColumna + "\n";
                }
                datos += "\n";
            }
            verdatos.setText(datos);
        }catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }


    }

    @FXML
    void procesarbtn(ActionEvent event) {

    }
    // se conecta a la base de datos 
        //int Nota = Integer.parseInt(Gradetxt.getText());
        //String sql = "insert into Grades (Name,Subject,Gender,Grade) values (? ,? ,? ,? )";
        //Connection con3 = conexion.connect();
        /*try {
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
        }*/
    @FXML
    void saveBtn(ActionEvent event) {
        Connect conexion = new Connect();
        
        String Nombre = Nametxt.getText();
        String Materia = Subjecttxt.getText();
        String Genero = Gendertxt.getText();
        boolean flag = true;
        double grade = 0.0;
        try{
            grade = Double.parseDouble(Gradetxt.getText());
        }catch(NumberFormatException ex) {
            flag = false;
        }
        
        if (Nombre.isEmpty() | Materia.isEmpty() | Genero.isEmpty() | flag) {
            try (Connection conn = conexion.connect(); 
            Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(
                        "INSERT INTO Grades (Name, Subject, Gender, Grade) VALUES ("
                                + "'" + Nombre + "'" + "," + "'" + Materia + "'" + "," + "'" + Genero + "'" + "," + grade + ");");
                System.out.println("Creado en la base de datos.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            Nametxt.setText("");
            Subjecttxt.setText("");
            Gendertxt.setText("");
            Gradetxt.setText("");

        } else {
            System.out.println("Error no se puede guardar en la base de datos");
        }
        
    }
    

}
