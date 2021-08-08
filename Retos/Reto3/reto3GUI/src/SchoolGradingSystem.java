import java.util.Scanner;
public class SchoolGradingSystem extends GradingSystem{
 

    
    public void loadData(){
        Scanner input = new Scanner(System.in);
        cantDatos = Integer.parseInt(input.nextLine());
        datos = new String[cantDatos][4];
        for (int i = 0; i < cantDatos; i++) {
            String vector[] = input.nextLine().split(" ");
            for (int j = 0; j < 4; j++) {
                datos[i][j] =  vector[j];
            }           
        }
    }
}