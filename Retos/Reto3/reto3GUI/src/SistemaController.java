

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

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
      
        int cantDatos = Integer.parseInt(IngresarDatos.getText()); 
        
        //Vector para la matriz principal
        
                
        for (int i=0;i<cantDatos;i++){
            String prueba=TextDatos.getText();
            String[] calificacion = prueba.split("\n");//Creando un vector apartir de un split en salto de linea
            
            for (int x=0;x<calificacion.length;x++){
                String[] calificaciones = calificacion[x].split(" "); //Creando la matriz  partir del vector de salto de linea con un split
                for(int j=0;j<calificaciones.length;j++){
                    
                    datos[x][j] = Float.parseFloat(calificaciones[j]);//Asignando valores a la matriz
                }
            }

        System.out.println(stat1());
        System.out.println(stat2());
        System.out.println(stat3());
        System.out.println(stat4());


        ResultData.setText(Float.toString(stat1()));
        //ResultData.setText(Float.toString(stat2()));
        //ResultData.setText(stat3());
        //ResultData.setText(stat4());


    }
       
}
       
}





