public class Estudiante {
    //atributo estatico
    private static int consecutivo = 0;//cada ves que se crea la instancia el valor debe aumentar ES UN CONTADOR
    //atributos de la clase estudiante  
    private int codigo ;
    private final String nombre; // no se puede crear el set
    private double nota1;
    private double nota2;
    private double nota3;


    //Constructor
    public Estudiante( String nombre, double nota1, double nota2, double nota3) {
        //Cada vez que se toma la instancia tomara los valores 
        this.codigo = consecutivo;
        consecutivo ++;
        //Los atriutos de la clase se pueden usar dentro del constructor 
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double promedio(){

        return (nota1 + nota2 + nota3 )/ 3;
    }
    
    

    public static int getConsecutivo() {
        return consecutivo;
    }

    public static void setConsecutivo(int consecutivo) {
        Estudiante.consecutivo = consecutivo;
    }

    //getter y setter
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }




    
}
