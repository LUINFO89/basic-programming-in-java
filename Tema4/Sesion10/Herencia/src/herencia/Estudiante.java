
package herencia;

public class Estudiante extends Persona { 
    
    private int CodigoEstudiante;
    private float NotaFinal;
    
    // generamos el cosntructor de los atributos de la clase
    // como el atributo de la clase esta estens podemos traer los
    // valores de la clase padre
    
    public Estudiante (String nombre, String apellido,int edad,int CodigoEstudiante,float NotaFinal){
    //para inicializar los valores escribimos la palabra super y asiganamos los 
    // valores de los atributos de la clase padre
    
        super (nombre,apellido,edad);
        this.CodigoEstudiante = CodigoEstudiante;
        this.NotaFinal = NotaFinal;
        
    }
    
    public void mostrarDatos(){
        
        System.out.println("Mostrando los datos del estudiante" + getNombre()+
               "\nApellido:" + getApellidos() + 
                "\nEdad:" + getEdad() + 
                "\nCodigo del estudiante"+ CodigoEstudiante+
                "\nNota final:" + NotaFinal);
    }
}
