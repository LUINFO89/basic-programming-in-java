public class producto {
    //atributos
    String Codigo;
    int PCompra;
    int CBodega;
    int CminBodega;

    //Condicion 

    boolean SolicitarPedido (){

        return CBodega < CminBodega;
        // if (CBodega < CminBodega)return true;else return false;
    }
    void Imprimir (){
        String Solicitar;
        if (SolicitarPedido()) 
        Solicitar = "Si";
        else 
        Solicitar = "no";
        System.out.printf("El articulo de codigo %s %n con existencias %d requiere solicitar %s %n",Codigo,CBodega,Solicitar,CminBodega);
    }
}
