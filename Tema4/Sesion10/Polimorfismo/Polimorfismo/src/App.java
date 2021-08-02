public class App {
    public static void main(String[] args) throws Exception {
        //Ejemplo1 ej = new Ejemplo1();

       // System.out.println(ej.sumar(4,6)); 
       // System.out.println( ej.sumar(4,6,89));
        //System.out.println( ej.sumar(4.7f,6.6f,89));
        //Avion a1 = new Avion();
        //AviondeGerra a2 = new AviondeGerra();
        //System.out.println(a1.volar()); 
        //System.out.println(a2.volar()); 
        suma sm = new suma();
        sm.pedirDatos() ;
        sm.Operacion();
        System.out.println(sm.mostrarresultado());
        // pueden ser del mismo tipo 
    }
}
