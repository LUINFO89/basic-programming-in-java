import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad minima requerida:");
        int cantidadminima = leer.nextInt();
        System.out.println("Ingrese la cantidad maxima requerida:");
        int cantidadmaxima = leer.nextInt();

        if (cantidadmaxima < cantidadminima){

            System.out.println("Realiza pedido a proveedor");
            //System.out.println("Cantidades de compra deseada");
            System.out.println("Cantidades de compra deseada:");
            int cantidadcompra = leer.nextInt();
            System.out.println("Valor de Compra:");
            int Valorcompra = leer.nextInt();
            System.out.println("Valor en caja menor:");
            int Valorcaja = leer.nextInt();

            int subtotalcompra = cantidadcompra * Valorcompra ;

            if (Valorcaja < subtotalcompra){

                System.out.println("No es posible realizar el pedido");
            }
            else{

                System.out.println("Si es posible realizar el pedido");


            }

        }
        else{

            System.out.println("No es necesario realizar el pedido ");
            System.out.println("Unidades que hacen falta vender:" );
            System.out.println(cantidadmaxima - cantidadminima);


        }
    }
}
