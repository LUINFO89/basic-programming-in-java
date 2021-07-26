public class App {
    public static void main(String[] args) throws Exception {
        Computador C1 = new Computador();
        // instancia del computador 
        C1.Color = "Negro";
        C1.setModelo("2021");
        C1.setProcesador("i3");
        C1.Ram ="8GB";
        C1.setSistemaOperativo("Win 10");
        
        System.out.println("Mi sistema operativo es:" + C1.getSistemaOperativo() + " Tengo de Memoria Ram" + C1.Ram + "El modelo es:" + C1.getModelo() );



    }
}
