public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner Entrada = new java.util.Scanner (System.in);
        producto P1 =  new producto();
        System.out.println("Digite el código:");
        String  Codigo = Entrada.next() ;
        System.out.println("Digite el Precio de Compra:");
        int  PCompra = Entrada.nextInt() ;
        System.out.println("Digite la cantidad en bodega :");
        int  Cbodega = Entrada.nextInt() ;
        System.out.println("Digite la canitdad minima en bodega:");
        int  CMinima = Entrada.nextInt() ;

        P1.Codigo = Codigo;
        P1.PCompra = PCompra;
        P1.CBodega = Cbodega;
        P1.CMinima = CMinima;
        
        if (P1.SolicitarPedido());
        


    }
}
