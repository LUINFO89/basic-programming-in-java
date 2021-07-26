public class App {
    public static void main(String[] args) throws Exception {
        boolean auxilio = Trabajador.auxilio(10000000);
        System.out.println("El salario basico " + Trabajador.getSalariobasico());
        System.out.println("requiere auxilio de transporte : " + auxilio);

    }
}
