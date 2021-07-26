import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);

        
        System.out.println("Cantidad de tipo de productos:");
        int n = leer.nextInt();
        int i = 0;
        int Total1 = 0;
        while (i < n) {

        System.out.println("Cantidad del producto  :");
        int cantidad1 = leer.nextInt();
        
        System.out.println("Valor del producto  :");
        int ValorProducto1 = leer.nextInt();
        
        Total1 = Total1 + (cantidad1 * ValorProducto1) ;
        
        
        System.out.println("Total de la factura: " + Total1 );
        i++;

        }

    }
}
