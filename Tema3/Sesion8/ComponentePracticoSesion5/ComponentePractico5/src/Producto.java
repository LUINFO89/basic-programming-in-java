public class Producto {
    /*
    Implementar una clase llamada Producto, la cual tenga los siguientes atributos y métodos:

    Atributos:
    ●	Código
    ●	Precio de compra
    ●	Cantidad en bodega
    ●	Cantidad mínima requerida en bodega.

    Métodos:
    ●	Solicitar pedido: devuelva true si debe solicitar el producto al proveedor y false en caso contrario.

    Diseñar un programa que:

    ●	Consulte el número de productos a manejar.Preguntar la cantidad de productos ,== Scanner ingrese cantidad de productos 
    ●	Cree una vector de productos en el cual se guardarán las instancias de cada uno de ellos.== Crear un arregloy un Ciclo para que valla añadiendo en la variable
    ●	Solicite por consola el código, el precio de compra, la cantidad en bodega y la cantidad mínima requerida para cada uno de los productos a manejar.= para dar valor al artibuto del objeto
    ●	Recorra el vector de productos y arroje una alerta en caso tal se deba solicitar el pedido al proveedor.== si las cantidades que tengo en bodega es menor a la cantidad pedida
    ●	Indique cuál es el código del producto que tiene menor cantidad de unidades en bodega, si hay varios que cumplen con la condición, indicar el primero de ellos. == debe ir a cada posicion del obejto y preguntar por el atributo en bodega cual es la menor ciclo for


    */
    //Primer paso crear los atributos segun el diagrama de clase
    private String Codigo;
    private float PreciodeCompra;
    private int CantidadBodega;
    private int CantidadMinima;
    
    // Generar los Get y los Set
    // para todos los atributos ya que son privados.

    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String codigo) {
        Codigo = codigo;
    }
    public float getPreciodeCompra() {
        return PreciodeCompra;
    }
    public void setPreciodeCompra(float preciodeCompra) {
        PreciodeCompra = preciodeCompra;
    }
    public int getCantidadBodega() {
        return CantidadBodega;
    }
    public void setCantidadBodega(int cantidadBodega) {
        CantidadBodega = cantidadBodega;
    }
    public int getCantidadMinima() {
        return CantidadMinima;
    }
    public void setCantidadMinima(int cantidadMinima) {
        CantidadMinima = cantidadMinima;
    }
    // Generamos el metodo de salida
    // Solicitar pedido: devuelva true si debe solicitar el producto al proveedor y false en caso contrario.

    public Boolean SolicitarPedido (){
        return  CantidadBodega < CantidadMinima ; 
    }




}
