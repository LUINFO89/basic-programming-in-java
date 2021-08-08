import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SistemaController extends GradingSystem  {
   

    @FXML
    private Button BtnCalculate;

    @FXML
    private TextField IngresarDatos;

    @FXML
    private TextArea ResultData;

    @FXML
    private TextArea TextDatos;


    @FXML
    void calculate(ActionEvent event) {
        Scanner input = new Scanner(IngresarDatos.getText());
        cantDatos = Integer.parseInt(input.nextLine());

        datos = new String[cantDatos][4];
        for (int i = 0; i < cantDatos; i++) {
            String vector[] = TextDatos.getText().split(" ");
            for (int j = 0; j < 4; j++) {
                datos[i][j] =  vector[j];
            }           
        }
        ResultData.setText(Float.toString(stat1()));
        ResultData.setText(Float.toString(stat2()));
        ResultData.setText(stat3());
        ResultData.setText(stat4());


    }
       
    
       
}





