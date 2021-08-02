
import java.util.*;
import java.util.Scanner;

import ComponentePractico.Calzado;
import ComponentePractico.PrendasDeVestir;
import ComponentePractico.Producto;

public class App {
    public static void main(String[] args) throws Exception {

        //●	Consulte el número de productos de tipo de prendas de vestir a manejar.
        //●	Consulte el número de productos de tipo calzado a manejar.
        //●	Cree un vector de productos de prendas de vestir en el cual se guardarán las instancias de cada uno de ellos.
        //●	Cree un vector de productos de calzado en el cual se guardarán las instancias de cada uno de ellos.
        //●	Solicite los datos requeridos para cada tipo de producto a guardar.


        Scanner entrada = new Scanner(System.in);
        // numero de productos de vestir
        int CantidadPrendas = Integer.parseInt(entrada.nextLine().strip());//.strip elilimina los espacios en blanco, si envio una linea vacia la elimina
        // numero de productos de calzado
        int CantidadCalzado = Integer.parseInt(entrada.nextLine().strip());
        //vector de productos de prendas de vestir 
        PrendasDeVestir vector1[] = new PrendasDeVestir[CantidadPrendas];
        Calzado vector2[] = new Calzado[CantidadCalzado];
        // solicite los datos requeridos y creamos todas las variables de las subclases
        String codigo, descripcion,tallaPrenda ;
        char PermitePlanchado,s,opc;
        float precioCompra,precioVenta;
        int CantidadBodega,Cantidadminima,Cantidadmaxima,TallaCalzado;
        // solicite los datos requeridos y creamos todas las variables de las subclases
        // Creamos una vatiable para el contador 
        Calzado canlzadoMayor;
        PrendasDeVestir prendasMayor;
        int StockMinimino ;
        String Ct;
        
        System.out.println("Prendas");

        for (int i = 0; i < CantidadPrendas; i++) {
            System.out.println("Digite el codigo: ");
            codigo = entrada.nextLine().strip();
            System.out.println("Digite la descripcion del producto: ");
            descripcion = entrada.nextLine();
            System.out.println("Digite el Precio de compra: ");
            precioCompra = Float.parseFloat(entrada.nextLine());
            System.out.println("Digite el precio de venta: ");
            precioVenta =Float.parseFloat(entrada.nextLine());
            System.out.println("Cantida en bodega: ");
            CantidadBodega= Integer.parseInt(entrada.nextLine());
            System.out.println("Cantida minima en bodega: ");
            Cantidadminima= Integer.parseInt(entrada.nextLine());
            System.out.println("Cantida Maxima en bodega del inventario: ");
            Cantidadmaxima= Integer.parseInt(entrada.nextLine());
            System.out.println("Digite la talla de la prenda: ");
            tallaPrenda= entrada.nextLine().strip();
            System.out.println("Permite planchado de la prenda: ");
            PermitePlanchado = entrada.nextLine().strip().toUpperCase().charAt(0); //quita los espacios los convierte en mayuscula y solo toma los valores de la primera
            // toma mayusculas o minisculas y toma solo el primer caracter
            //crearemos las instancias de prendas de vestir
            PrendasDeVestir p1 = new PrendasDeVestir (codigo, descripcion, precioCompra, precioVenta, CantidadBodega, Cantidadminima, Cantidadmaxima, tallaPrenda, PermitePlanchado = 'S');
            vector1[i] = p1;


        }
        // se realiza el vector para el segundo caso
        System.out.println("Calzado");
        for (int i = 0; i < CantidadCalzado; i++) {
            System.out.println("Digite el codigo: ");
            codigo =entrada.nextLine().strip();
            System.out.println("Digite la descripcion del producto: ");
            descripcion =entrada.nextLine().strip();
            System.out.println("Digite el Precio de compra: ");
            precioCompra = Float.parseFloat(entrada.nextLine());
            System.out.println("Digite el precio de venta: ");
            precioVenta =Float.parseFloat(entrada.nextLine());
            System.out.println("Cantida en bodega: ");
            CantidadBodega= Integer.parseInt(entrada.nextLine());
            System.out.println("Cantida minima en bodega: ");
            Cantidadminima= Integer.parseInt(entrada.nextLine());
            System.out.println("Cantida Maxima en bodega del inventario: ");
            Cantidadmaxima= Integer.parseInt(entrada.nextLine());
            System.out.println("Digite la talla calzado: ");
            TallaCalzado= Integer.parseInt(entrada.nextLine()); 
            // toma mayusculas o minisculas y toma solo el primer caracter
            //crearemos las instancias de prendas de vestir
            Calzado p2 = new Calzado (codigo, descripcion, precioCompra, precioVenta, CantidadBodega, Cantidadminima, Cantidadmaxima, TallaCalzado);

            vector2[i] = p2;
            
        }

        do {
            System.out.println("1. Verificar Productos a pedir");
            System.out.println("2. Calzado con mayor cantidad de unidades");
            System.out.println("3. Prenda con mayor cantidad de unidades");
            System.out.println("4. Modificar cantidad mínima requerida en bodega");
            System.out.println("5. Vender producto");
            System.out.println("6. Consulta producto");
            System.out.println("Digite Opcion: ");


            opc = entrada.nextLine().strip().toUpperCase().charAt(0); // convierte las mayusculas y minusculas , parte los textos y lo deja solo las primeta letra
            switch (opc) {
                case '1':
                //●	Verificar productos a pedir: recorrer los vectores de productos y arrojar una alerta
                // en caso tal se deba solicitar el pedido al proveedor.
                
                for (PrendasDeVestir X:vector1 ) {

                    if (X != null && X.Solicitarpedido()){

                        System.out.println("Alerta! debe solicitar el producto, con código:" + X.getCodigo());
                    }  
                }
                for (Calzado Y:vector2 ) {

                    if (Y != null && Y.Solicitarpedido()){

                        System.out.println("Alerta! debe solicitar el producto, con código:" + Y    .getCodigo());
                    }  
                }
                break;
                case '2':
                //●	Calzado con mayor cantidad de unidades: indicar cuál es el código del 
                //producto que tiene mayor cantidad de unidades en bodega, si hay varios que cumplen 
                //con la condición, indicar el primero de ellos.
                canlzadoMayor=vector2[0];// le asiganamos calzado a la pocicion sub[0] del vector
                for (Calzado P:vector2)  
                    if (canlzadoMayor.getCantidadenbodega() < P.getCantidadenbodega())// Se recorre el vector de objetos
                        canlzadoMayor = P;
                    System.out.println("Calzado con mayor cantidad de existencias" );
                    System.out.println(canlzadoMayor.toString());
                break;
                case '3':
                //●	Prenda con mayor cantidad de unidades: indicar cuál es el código del producto que tiene mayor 
                //cantidad de unidades en bodega, si hay varios que cumplen con la condición, indicar el primero de ellos.
                prendasMayor=vector1[0];
                for(PrendasDeVestir Z:vector1)
                    if (prendasMayor.getCantidadenbodega()<Z.getCantidadenbodega())
                    System.out.println("Prendas de vestir con mayor cantidad de existencias" );
                    System.out.println(prendasMayor.toString());
                break;
                case '4':
                //●	Modificar cantidad mínima requerida en bodega: leer código de producto, el tipo (calzado o prenda)
                // y el nuevo valor para la cantidad de unidades mínimas requeridas, validar en el método set de la 
                //variable correspondiente que la nueva cantidad no sea menor a 0, en caso de serlo establecer la cantidad mínima como 0
                System.out.print("Digite el codigo del producto: ");
                codigo = entrada.nextLine().strip();
                System.out.print("Cual es el nuevo Stock mínimo en bodega : ");
                StockMinimino = Integer.parseInt(entrada.nextLine().strip());
                System.out.print("Calzado o prenda: ");
                Ct = entrada.nextLine().strip();
                if (Ct.equalsIgnoreCase("Calzado")){
                    for(Calzado P:vector2){
                        if (P.getCodigo().equalsIgnoreCase(codigo)){
                            P.setCantidadminima(StockMinimino);
                            System.out.println( P.toString());
                            break;
                        }
                        
                    } 

                }
                
                else if(Ct.equalsIgnoreCase("Prenda")){
                    for(PrendasDeVestir F:vector1){ 
                        if (F.getCodigo().equalsIgnoreCase(codigo)){
                            F.setCantidadminima(StockMinimino);
                            System.out.println( F.toString());
                            break;
                        } 
                          
                     }
                }
                
                break;
                case '5':
                //●	Vender producto: solicite el código de un producto a vender, el tipo (calzado o prenda), 
                //y las unidades correspondientes, calcule el valor de la factura con descuento y sin descuento.
                // Validar que existan las unidades necesarias para la venta y modificar las unidades existentes después
                // de la venta utilizando el método set de la variable correspondiente.

                System.out.print("Digite el codigo del producto: ");
                codigo = entrada.nextLine().strip();
                System.out.print("Calzado o prenda: ");
                Ct = entrada.nextLine().strip();
                System.out.print("Nuevas Unidades: ");
                StockMinimino = Integer.parseInt(entrada.nextLine().strip());
                
                if (Ct.equalsIgnoreCase("Calzado"))
                for(Calzado c:vector2)
                    if (c.getCodigo().equalsIgnoreCase(codigo))
                        if(c.getCantidadenbodega()>StockMinimino)
                        c.TotalaPagar(StockMinimino);

                if (Ct.equalsIgnoreCase("prenda"))
                for(PrendasDeVestir m:vector1)
                    if (m.getCodigo().equalsIgnoreCase(codigo))
                        if(m.getCantidadenbodega()>StockMinimino)
                        m.TotalaPagar(StockMinimino);


                break;
                case '6':
                System.out.print("Digite el codigo del producto: ");
                codigo = entrada.nextLine().strip();
                System.out.print("Calzado o prenda: ");
                Ct = entrada.nextLine().strip();
                if (Ct.equalsIgnoreCase("calzado")){

                    for (Calzado c : vector2) {
                        if (c.getCodigo().equalsIgnoreCase(codigo)){ 
                            System.out.println(c.mostar());
                        break;
                        }
                    }
                
                }
                if (Ct.equalsIgnoreCase("prendas")){

                    for (PrendasDeVestir w : vector1) {
                        if (w.getCodigo().equalsIgnoreCase(codigo)){ 
                            System.out.println(w.mostar());
                        break;
                        }
                    }
                
                }

                break;
                default:
                System.out.println("Opción no valida");
                break;
            }
        } while (opc != 'S');

        entrada.close();




    }
}
