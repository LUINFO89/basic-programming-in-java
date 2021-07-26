public class Computador {
    //atributos
    private String Modelo;
    private String SistemaOperativo;
    private String Procesador;
    public String Ram;
    public String Color;
    
    public Computador(String modelo, String sistemaOperativo, String procesador, String ram, String color) {
        this.Color = modelo;//parametro lo que esta entre parentesis
        SistemaOperativo = sistemaOperativo;//this hace referencia al atributo
        Procesador = procesador;
        Ram = ram;
        Color = color;
    }

    //public Computador(){
    //}

    // Generacion de los Getter y setter.
    // Public es el parametro de la visibilidad , string es el tipo de datos,
    // y getter sistema opetativo es el return se muestra el atributo privado
    // Es el alcance de los valores provados convertirlos a publicos 
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getSistemaOperativo() {
        return SistemaOperativo;
    }
    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }
    public String getProcesador() {
        return Procesador;
    }
    public void setProcesador(String procesador) {
        Procesador = procesador;
    }


}
