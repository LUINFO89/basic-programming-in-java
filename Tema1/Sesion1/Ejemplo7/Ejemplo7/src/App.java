import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        int Totalvendido=0 ;
        boolean clientesXAtender = true;
        Scanner leer = new Scanner(System.in);

        
        System.out.println("Cantidad de clientes:");
        int n = leer.nextInt();
        
        int Total1 = 0;
        

        for( int i = 1  ; i <= n ; i++ ){
            System.out.println("Cantidad de tipo de productos:Cliente : " + i +":");
            int x = leer.nextInt();
            System.out.println("Cliente Numero:"+ i + ":");
            for( int j = 1; j <= x; j++ ){
                
            System.out.println(" ** Cantidad del producto  :"+ j + ":");
            int cantidad1 = leer.nextInt();
            
            System.out.println(" ** Valor del producto  :"+ j + ":");
            int ValorProducto1 = leer.nextInt();
            
            Total1 = Total1 + (cantidad1 * ValorProducto1) ;
            System.out.println("Total de la factura: " + Total1 );

            if (Total1 > 100000){
                double descuento = Total1 - 0.10 ;
                System.out.println("Ganaste de un 10% de descuento " + descuento);
            }
            


            Totalvendido = Totalvendido + Total1; 


            }
        }

        System.out.println("¿Hay clientes por atender? (si o no) ");
            String nuevoCliente = leer.next();
        if (nuevoCliente.equals("no")) {
            clientesXAtender = false;
        }
        n++;

        System.out.println("Total Vendido: " + Totalvendido);

    


    }
}
