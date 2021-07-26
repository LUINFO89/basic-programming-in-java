import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        

        
            int n, i, V[] = new int[100];
            Scanner leer = new Scanner(System.in);
            System.out.print("Cantidad estudiantes: ");
            n = leer.nextInt();
            for (i = 0; i < n; i++) {
            System.out.print("Elemento "+(i+1)+": ");
            V[i] = leer.nextInt(); 
            }
            System.out.println("Elementos del vector");
            for (i = 0; i < n; i++) {
            System.out.println(V[i]);
            
            }
    }
}
