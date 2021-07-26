import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int x,peso;
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite su peso: ");
        peso = leer.nextInt();
        //System.out.println(peso);
        System.out.print("Digite su nombre: ");
        nombre = leer.next();
        System.out.println(nombre);
        System.out.printf("Tú nombre es %s, y pesas %d Kilos \n",nombre,peso);


        //Programa que crea un conteo de numeros de dos en dos
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite la cantidad de numeros que desea ver");
        x = entrada.nextInt();
        for (int j = 0; j <= x; j++) { //i+=2 Aumenta de dos en dos 
            
            if (j % 2 == 0){
                System.out.println("Fizz " + j);
                
            }
            if (j % 2 == 1){
                System.out.println("buzz " + j);   
                     }
             }
        
        for (int j = 2; j <= x*2; j+=2) {

            System.out.println(j);            
            }

        //ciclo while
        int k = 2;
        while ( k <= x*2) {
            
            System.out.println(k);           
            k +=2;
             }
 
         leer.close();
             
        }
    }

