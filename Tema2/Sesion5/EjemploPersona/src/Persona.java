public class Persona {
    // Se encapsula solo atraves de los metodos publicos que se vana tener 
    //atributos
    private int Identificacion ;
    private String Nombre ;
    private int Edad;
    //Lo primero que debe mostrar es el constructor despues de los atributos
    public Persona() {

    }

    




    public Persona(int identificacion, String nombre) {
        Identificacion = identificacion;
        Nombre = nombre;
    }






    //Getter and Setter
    public int getIdentificacion() {
        return Identificacion;
    }
   
    public void setIdentificacion(int identificacion) {
        Identificacion = identificacion;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    //Getter and Setter

    //---------Metodos--------
    public void MostrarDatos(){
        System.out.println("Su identificacion es :" + Identificacion);
        System.out.println("Su Nombre es :" + Nombre);
        System.out.println("Su Edad es :" + Edad);
    }


    



}
