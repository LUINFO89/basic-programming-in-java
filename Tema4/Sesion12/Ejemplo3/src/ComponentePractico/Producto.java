package ComponentePractico;

public class Producto {

//atributos
private String Codigo;
private String	Descripción;
private float	Preciodecompra;
private float Preciodeventa;
private	int Cantidadenbodega;
private	int Cantidadminima;
private	int Cantidadmaxima;
private static	float PorcentajedeDescuento = 0.01f;
// De acuerdo al diagrama de clases 
// Lo que se debe asignar despues de los atributos son los constructores
// Crearemos un constructor vacio y uno con parametros 
public Producto() {
}
public Producto(String codigo, String descripción, float preciodecompra, float preciodeventa, int cantidadenbodega,
        int cantidadminima, int cantidadmaxima) {
    Codigo = codigo;
    Descripción = descripción;
    Preciodecompra = preciodecompra;
    Preciodeventa = preciodeventa;
    Cantidadenbodega = cantidadenbodega;
    Cantidadminima = cantidadminima;
    Cantidadmaxima = cantidadmaxima;
}

//Métodos:
// Crear los metodos get y set de los atributos
public String getCodigo() {
    return Codigo;
}
public void setCodigo(String codigo) {
    Codigo = codigo;
}
public String getDescripción() {
    return Descripción;
}
public void setDescripción(String descripción) {
    Descripción = descripción;
}
public float getPreciodecompra() {
    return Preciodecompra;
}
public void setPreciodecompra(float preciodecompra) {
    Preciodecompra = preciodecompra;
}
public float getPreciodeventa() {
    return Preciodeventa;
}
public void setPreciodeventa(float preciodeventa) {
    Preciodeventa = preciodeventa;
}
public int getCantidadenbodega() {
    return Cantidadenbodega;
}
public void setCantidadenbodega(int cantidadenbodega) {
    Cantidadenbodega = cantidadenbodega;
}
public int getCantidadminima() {
    return Cantidadminima;
}
public void setCantidadminima(int cantidadminima) {
    if(cantidadminima < 0)
    cantidadminima = 0;
    this.Cantidadminima = cantidadminima;
}
public int getCantidadmaxima() {
    return Cantidadmaxima;
}
public void setCantidadmaxima(int cantidadmaxima) {
    Cantidadmaxima = cantidadmaxima;
}
public static float getPorcentajedeDescuento() {
    return PorcentajedeDescuento;
}
public static void setPorcentajedeDescuento(float porcentajedeDescuento) {
    PorcentajedeDescuento = porcentajedeDescuento;
}
//Metodos solicitados para el problema
// -------------------------------------------
//●	Solicitar pedido: devuelva true si debe solicitar el producto al proveedor y false en caso contrario.
public boolean Solicitarpedido() {
    return Cantidadenbodega < Cantidadminima;
}
//●	Calcular total a pagar : devuelva la cantidad total a pagar al proveedor dado una cantidad de unidades de compra.
public float TotalaPagar(int cantidad) {
    return cantidad * this.Preciodecompra ; //cantidad precio de compra al proveedor
}

public String toString() {
    return String.format("%s %s %f %f %d %d %d",Codigo,Descripción,Preciodecompra,Preciodeventa,Cantidadenbodega,Cantidadmaxima,Cantidadminima);
    
}
public String mostar() {
    return String.format("%s %s %f %f %d %d %d",this.Codigo,this.Descripción,this.Preciodecompra,this.Preciodeventa,this.Cantidadenbodega,this.Cantidadmaxima,this.Cantidadminima);
    
}


}
