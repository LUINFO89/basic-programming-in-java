import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
            int n, i, V[] = new int[100], pos = 1, x;
            boolean sw = false;
            Scanner leer = new Scanner(System.in);
            //cantidad de elementos 
            System.out.print("Cantidad de estudiantes: ");
            n = leer.nextInt();

            // ciclo para 
            for (i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            V[i] = leer.nextInt();
            }
            System.out.print("Elemento a buscar:");
            x = leer.nextInt();
            while (pos <= n && sw == false) {
            if (V[pos] == x) {
            sw = true;
            } else {
            pos = pos + 1;
            }
            }
            if (sw = true) {
            System.out.println("Encontrado");
            } else {
            System.out.println("No encontrado");
            }
            
           


    }
}
