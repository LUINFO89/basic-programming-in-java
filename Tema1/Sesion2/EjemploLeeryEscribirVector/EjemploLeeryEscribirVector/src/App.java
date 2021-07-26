import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int n , i;
        String v [] = new String [100];

        Scanner leer = new Scanner(System.in);

        //Lineas que permiten recibir la cantidad de datos de los estudiantes
        System.out.print("Cantidad de estudiantes:");
        n = leer.nextInt();
        // ciclo para recibir los codigos de los estudiantes y almacenarlos en la variable V
        for (int j = 0; j < n; j++) {
            System.out.println("Elemento " + (j + 1) + ":");
            v[j] = leer.next();// se reciben los datos y se guardan en la variable v
        }

        // ciclo para mostrar los elementos que se encuentran guardados en la variable V
        System.out.println("Elementos del vector");
        for (int j = 0; j < n; j++) {
            System.out.println(v[j]); // se revisa la variable v temporal y se muestra lo que se guardo allí
            
        }

    }
}
