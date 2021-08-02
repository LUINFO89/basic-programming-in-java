public class Motorola extends Telefono implements Camara , LectorBiometrico{

    public Motorola() {
    }

    public Motorola(String os, String model, String color, String ram) {
        super(os, model, color, ram);
    }

    @Override
    public String Zoom() {
        // TODO Auto-generated method stub
        return "Estoy haciendo zoom  ";
    }

    @Override
    public String grabar() {
        // TODO Auto-generated method stub
        return "Estoy grabando desde el motorola ";
    }

    @Override
    public String GuardarHuella() {
        // TODO Auto-generated method stub
        return "Estoy guardando la huella ";
    }

    @Override
    public String lectorHuella() {
        // TODO Auto-generated method stub
        return "Estoy haciendo lectura  de la huella ";
    }
    

}
