public class App {
    public static void main(String[] args) throws Exception {
        
        Estudiante Estudiante1 = new Estudiante("Luis",4,5,4.5); // instanciar es llamar la clase estudiante al objeto
        Estudiante Estudiante2 = new Estudiante("Frank",5,5,4.5); // instanciar es llamar la clase estudiante al objeto
        Estudiante Estudiante3 = new Estudiante("Yajaira",2.5,4.1,5); // instanciar es llamar la clase estudiante al objeto
        
        //Se pasan los valores de las isntancias 

        System.out.printf("El estudiante %s con codigo %d su promedio es de %.2f %n" , Estudiante1.getNombre(),Estudiante1.getCodigo(),Estudiante1.promedio());
        System.out.printf("El estudiante %s con codigo %d su promedio es de %.2f %n", Estudiante2.getNombre(),Estudiante2.getCodigo(),Estudiante2.promedio());
        System.out.printf("El estudiante %s con codigo %d su promedio es de %.2f %n", Estudiante3.getNombre(),Estudiante3.getCodigo(),Estudiante3.promedio());
        System.out.printf("el codigo dele studiante %d", Estudiante.getConsecutivo());
        


    }
}
