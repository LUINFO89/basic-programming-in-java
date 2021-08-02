package ComponentePractico;

public class PrendasDeVestir extends Producto { // como es una subclase de producto debe tener el extend
    // Prendas de vestir (como lo son blusas, jeans, camisas, etc) el cual debe tener los siguientes parámetros adicionales:
    // Talla: S, M, L, etc
    // Permite planchado: verdadero o falso.

    private String talla;
    private char PermitePlanchado;

    // se eisnertar los constructores de la clase padre y de la clase hija

    public PrendasDeVestir() {
        
    }
    public PrendasDeVestir(String codigo, String descripción, float preciodecompra, float preciodeventa,
            int cantidadenbodega, int cantidadminima, int cantidadmaxima, String talla, char permitePlanchado) {
        super(codigo, descripción, preciodecompra, preciodeventa, cantidadenbodega, cantidadminima, cantidadmaxima);
        this.talla = talla;
        this.PermitePlanchado = permitePlanchado;   

    }
    // se agregan los getter y setter de los atributos de la clase
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public char isPermitePlanchado() {
        return PermitePlanchado;
    }
    public void setPermitePlanchado(char permitePlanchado) {
        PermitePlanchado = permitePlanchado;
    }
    @Override
    public String mostar() {
        // TODO Auto-generated method stub
        return String.format("%s %s %c" ,super.mostar(),this.talla, this.PermitePlanchado);
    }

    
    


    
}
