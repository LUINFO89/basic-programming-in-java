package ComponentePractico;

public class Calzado extends Producto { // No olvidar agregar los extends
    //●	Calzado (como lo son tenis, calzado formal, sandalias, etc) el cual debe tener el siguiente parámetro adicional:
    //○	Talla: 35, 36, 37, etc

    private int tallaCalzado;

    
  
    // Generamos los constructores 

    public Calzado() {
    }


    public Calzado(String codigo, String descripción, float preciodecompra, float preciodeventa, int cantidadenbodega,
            int cantidadminima, int cantidadmaxima, int tallaCalzado) {
        super(codigo, descripción, preciodecompra, preciodeventa, cantidadenbodega, cantidadminima, cantidadmaxima);
        this.tallaCalzado = tallaCalzado;
    }


    @Override
    public String mostar() {
        // TODO Auto-generated method stub
        return String.format( "%d %s %s" , super.mostar(),this.tallaCalzado );
    }






    


    
}
