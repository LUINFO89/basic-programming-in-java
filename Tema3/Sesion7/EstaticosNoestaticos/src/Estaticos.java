public class Estaticos {

    //tipo privado
    // atributo de tipo estatio y privado
    private static String nombre;
    // Generamos los getter and setter 
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        //nombre de la clase punto el atributo
        Estaticos.nombre = nombre;
    }
    // cuando no es estatico me pone el this para poder llamar el atributo

    
}
