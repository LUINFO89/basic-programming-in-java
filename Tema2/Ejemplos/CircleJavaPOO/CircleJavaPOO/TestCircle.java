public class TestCircle {
    //En esta segunda clase TestCircle procedemos a llamar y usar nuestros metodos de la clase circle

    public static void main(String[] args) {
        // se creara una instancia con radio y color definido 
        Circle c1= new Circle(1.1 , "blue");
        System.out.println(c1);
        Circle c2= new Circle(2.2);
        System.out.println(c2);
        Circle c3= new Circle();
        System.out.println(c3);

        // se envia un nuevo radio para el c1
        // y un nuevo color para c1
        c1.setRadius(3.3);
        c1.setColor("Verde");
        System.out.println(c1);

        // obtendremos el nuevo radio de c1
        // El color y el area final
        // al final mostramos el metodo de la circunferencia
        System.out.println("El radio es: " + c1.getRadius());
        System.out.println("El Color es: " + c1.getColor());
        System.out.printf("El Area es: %.2f%n" , c1.getArea());
        System.out.printf("La Circunferencia es: %.2f%n " , c1.getCircunference());


        



        
    }
}
