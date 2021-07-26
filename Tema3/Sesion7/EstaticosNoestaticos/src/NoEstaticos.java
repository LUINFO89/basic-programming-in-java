public class NoEstaticos {
    public final String apellido = "Soto Mesa";// No se puede cambiar el valor por final 
    private String nombre;
    // siempre que sea privado debe usar el gentter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // para los no estaticos nos mostrara los geter y seter
    // nos mostrara el this

    public String getApellido() {
        return apellido;
    }

    

    
    
}
