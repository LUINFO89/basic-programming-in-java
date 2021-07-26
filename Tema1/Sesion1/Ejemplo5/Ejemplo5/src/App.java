import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);

        
        System.out.println("Ingrese el dia de la semana en numero:");
        int day = leer.nextInt();

        System.out.println("Ingrese el valor del producto para calcular el descuento");
        int price = leer.nextInt();

        double descuento = 0;
        switch (day) {
        case 1:
            
            System.out.println("Monday");
            descuento = 0.05;

            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Looking forward to the Weekend");
        }

        double total = price - (price * descuento );
            System.out.println("total  " + total);
        

    }
}
