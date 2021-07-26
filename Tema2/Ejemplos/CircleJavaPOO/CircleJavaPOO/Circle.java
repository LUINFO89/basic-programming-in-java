import org.graalvm.compiler.nodes.NodeView.Default;

public class Circle {

    //  Creamos variables constantes públicas
    // Se crear una variable final para que se asignen de manera fija y no cambien 
    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "Rojo";
    // Variables privadas
    private double radius;
    private String color;

    /** Se crea un radio y un circulo con un radio y color por defecto*/
    // se crea un constructor para radius y color
    public Circle(){ // 1 constructor
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }
    /** Constructor para un circulo  que recibe un radio y el color por defecto*/
    public Circle(double radius){ // 2 constructor
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }
    /** Constructor para un circulo con radio y color 
     * Constructor que ingresa por paramentro los valores de radius y color
    */
    public Circle(double radius, String color){ // 3 constructor
        this.radius = radius;
        this.color = color;
    }

        // se crean los metodos para actualizar las variables 

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /** Devuelve una cadena autodescriptiva
     * Se crearn los valores de getter y setter de las variables de radio y color 
     * asi mismo hace los valores correspondientes para generar el area y la circunferencia de los mismos
     * 
     */

     public String toString(){

        return "circle [radio ="+ radius + ", color =" + color +" ]";
     }

     /*
        Devuelve el area de este circulo
     */
     public double getArea(){
        return radius * radius * Math.PI;
     }
    
     /** 
      * Devuelve la circunferencia de este circulo
      */
     public double getCircunference(){
        return 2.0 * radius * Math.PI;    
     }

     

    


    
}
