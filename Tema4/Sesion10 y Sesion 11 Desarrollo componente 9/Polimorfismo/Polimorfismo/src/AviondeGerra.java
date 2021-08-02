public class AviondeGerra extends Avion {

    @Override // comentario para que sepa que el metodo sae sobre 
    public String volar() {
        // TODO Auto-generated method stuberscribe
        return String.format("Soy la hija y puedo atacar", super.volar()); // el super es para sobre escribir 
        // que ya existe y que debe heredar de avion en el metodo
    }
    // hereda los metodos de la clase padre 
    
}
