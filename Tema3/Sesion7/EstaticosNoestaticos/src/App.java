public class App {
    public static void main(String[] args) throws Exception {
        
        // en ambientes estaticos no es necesario instanciar la clase
        //Instancia estatica
        Estaticos E1 = new Estaticos();
        Estaticos E2 = new Estaticos();
        Estaticos E3 = new Estaticos();
        //no estaticos
        NoEstaticos E4 = new NoEstaticos();
        NoEstaticos E5 = new NoEstaticos();
        NoEstaticos E6 = new NoEstaticos();
        //E4.apellido = "Luis";
        //no se puede cambiar el valor por el final
        // Se llaman los no estaticos 
        E4.setNombre("Luis");
        E5.setNombre("Hernando");
        E6.setNombre("Soto");
        //imresion no estaticos
        
        E3.setNombre("nombreLuis"); 
        Estaticos.setNombre("Mesa");
        
        System.out.println(E4.getNombre());
        System.out.println(E5.getNombre());
        System.out.println(E6.getNombre());
        System.out.println(E1.getNombre());
        System.out.println(E2.getNombre());
        System.out.println(E3.getNombre());
        System.out.println(E4.apellido);
        // el objeto estatico queda en todos lo elementos de la clase 
        // si los objetos son E1,2,3 se para el get con un valor este sera el mismo
        // en todos los get
        







    }
}
