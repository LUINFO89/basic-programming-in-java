import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Producto[] Vector; // se declara el arreglo
        String Codigo ; // Se crean las variables para ingesarlas al primer ciclo
        float PrecioCompra;
        int CantidadBodega;
        int CantidadMinima;

    // ●	Consulte el número de productos a manejar.Preguntar la cantidad de productos ,== Scanner ingrese cantidad de productos */
        Scanner entrada = new Scanner(System.in); // Caundo se hace instancia se llama igual que la clase 
        // en este caso como no tengo constructor uso el que viene con scanner 
        System.out.println("Digite cantidad de productos:");// se piden la cantidad de prodcutos y alli se guardan para posteriormente  usarlos
        int CantidadProducto = entrada.nextInt(); //Se almacenana los datos del input
    //  ●	Cree una vector de productos en el cual se guardarán las instancias de cada uno de ellos.== Crear un arregloy un Ciclo para que valla añadiendo en la variable
        Vector = new Producto[CantidadProducto]; // se asocia el arreglo para el vector
    //  ●	Solicite por consola el código, el precio de compra, la cantidad en bodega y la cantidad mínima requerida para cada uno de los productos a manejar.= para dar valor al artibuto del objeto
        //por cada objeto"producto" debe tener 4 atributos codigo, precioCom, CntidadBode,CantidaMin
        // se hace un ciclo for para que haga la repeticion de las cantidades de los metodos
        entrada.nextLine();// este next line es para poder limpiar la cache del scanner y asi porde
        //usar el string del ciclo
        for (int i = 0; i < CantidadProducto; i++) {
            System.out.println("Digite el codigo del producto: ");
            Codigo = entrada.nextLine();
            System.out.println("Digite el Precio de Compra: ");
            PrecioCompra = entrada.nextFloat();
            System.out.println("Digite la cantidad en bodega: ");
            CantidadBodega = entrada.nextInt();
            System.out.println("Digite la cantidad MInima a solicitar: ");
            CantidadMinima = entrada.nextInt();
            entrada.nextLine();// este next line es para poder limpiar la cache del scanner y asi porde
            //usar el string del ciclo
            // Creamos una instancia de la clase producto
            Producto p1 = new Producto();
            // Inicalizar los atributos de la instancia 
            p1.setCodigo(Codigo);
            p1.setPreciodeCompra(PrecioCompra);
            p1.setCantidadBodega(CantidadBodega);
            p1.setCantidadMinima(CantidadMinima);
            // Se incializa los valores del objeto
            // Se inserta el objeto en la posicion i del vector 
            Vector[i] = p1; // Vector de objetos creado
    //     ●	Recorra el vector de productos y arroje una alerta en caso tal se deba solicitar el pedido al proveedor.== si las cantidades que tengo en bodega es menor a la cantidad pedida
           //  recorra es un ciclo
        }
        for (int i = 0; i < CantidadProducto; i++) {

                if (Vector[i].SolicitarPedido()) { System.out.println("ALERTA! , Debe solicitar el producto del codigo: " + Vector[i].getCodigo() ); }
                
            }
    //     ●	Indique cuál es el código del producto que tiene menor cantidad de unidades en bodega, si hay varios que cumplen con la condición, indicar el primero de ellos. == debe ir a cada posicion del obejto y preguntar por el atributo en bodega cual es la menor ciclo for
            // Hacer un ciclo y preguntar cual es el menor 
            // Se asignar el valor a una variable memor
            String Codigo1 = "";
            int menor = Vector[0].getCantidadBodega();// se asigana una variable la primera posicion en bodega 
        for (int i = 1; i < CantidadProducto ; i++) {
                if (menor > Vector[i].getCantidadBodega()) { 
                    menor = Vector[i].getCantidadBodega();
                    Codigo1 = Vector[i].getCodigo(); 
                }
            }
        
    System.out.printf("El producto con codigo %s es el que menor cantidad de existencias tienen con %d " , Codigo1, menor);        

    }
}
