

public class App {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("......................Primer Ejercicio if .....................");

        int i = 20;
        if (i < 15)
            System.out.println("Soy menor que 15");
        else
            System.out.println("Soy mayor que 15");
     

        System.out.println("......................Segundo Ejercicio if anidado.....................");
        int x = 10;
        if (x == 10)
        {
        // Primera declaración if
        if (x < 15)
        System.out.println("soy menor que 15");
        // Declaración if anidada
        // Solo se ejecutará si la instrucción anterior
        // es verdad
        if (x < 12)
        System.out.println("yo también soy menor que 12");
        else
        System.out.println("soy mayor que 15");
        }
        System.out.println("......................Tercer Ejercicio Switch.....................");

        int h = 9;
        switch (h)
        {
            case 0 :
                System.out.println("h es cero.");
                break;
            case 1:
                System.out.println("h es uno");
                break;
            case 2:
                System.out.println("h es dos");
                break;
            default:
                System.out.println("h es mayor que 2.");

        }
    }
}
