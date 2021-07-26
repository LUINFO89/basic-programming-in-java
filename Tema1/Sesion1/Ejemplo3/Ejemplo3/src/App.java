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
            

        }
        else{

            System.out.println("No es necesario realizar el pedido ");
            System.out.println("Unidades que hacen falta vender:" );
            System.out.println(cantidadmaxima - cantidadminima);


        }
        
    }
}
