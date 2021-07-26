import java.util.*;
import java.util.Scanner;

import org.graalvm.compiler.graph.Node.Input;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //CUANTAS FILAS Y CUATANTAS COLUMNAS    
    Scanner datos = new Scanner(System.in);
        System.out.println("¿Cuántas filas?");
        int filas = datos.nextInt();
        System.out.println("¿Cuántas columnas?");
        int columnas = datos.nextInt();
        Integer matriz [][] = new Integer[filas][columnas];
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                

            System.out.println(String.format("Ingrese el elemento en la posición [%d][%d]", i, j));
            matriz[i][j] = datos.nextInt();
        }

}
datos.close();
for(int l = 0; l < filas; l++){
    for(int t = 0; t < columnas; t++){
        System.out.print("\t"+ matriz[l][t]);
    }
    System.out.println();
    }

}
}
