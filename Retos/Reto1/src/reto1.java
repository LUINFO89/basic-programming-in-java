
import java.util.Scanner;
import javax.lang.model.util.ElementFilter;
import java.security.Principal;
import java.util.*;
public class Reto1 {
    // 1.0 0.0 1.0 4.8
    // Nombre (1.0)
    // Genero ( 0.0)
    // Materia (1.0)
    // Nota(4.8)
  
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();// numero de estudiantes
        //inicializamos las variables de los contadores
        int contRegulares = 0;
        int ct1 = 0;
        int ct2 = 0;
        int ct3 = 0;
        //inicializamos las variables de la tabla alumnos
        double es = 0;
        double gen = 0;
        double mat = 0;
        double nt = 0;
        // inicializamos las variables para los promedio y los mayores
        float suma = 0.00f;
        float prom1= 0.00f;
        float prom2= 0.00f;
        float prom3= 0.00f;
        double mayor = 0;
        double mayorest = 0;
        
        
        
        input.nextLine();
        // Leer como texto y pasar a double
        for (int i = 0; i < n; i++) {
            String text = input.nextLine();
             // dividirla 
             String [] datos = text.split(" ");
             // transformarla
             es = Double.parseDouble(datos[0]); 
             gen = Double.parseDouble(datos[1]);
             mat = Double.parseDouble(datos[2]);
             nt = Double.parseDouble(datos[3]);
             suma += nt; 
             
            
            // comparador para realizar el conteo de las notas  
            // 
            //●	¿Cuántos exámenes tienen una calificación Regular?
            if(nt > 2.5 && nt <= 3.5) {
                contRegulares ++; } 
            // se inicializar la variable y se toma en cuenta que el genero sea igual a masculino o cero
            // luego la materia debe ser iguala a 1,2,3 y posterior a esto se 
            // realiza el promedio y el contador de los difentes if
            if ((mat == 1)&&(gen == 0)){prom1 += nt;ct1 ++;}
            if ((mat == 2)&&(gen == 0)){prom2 += nt;ct2 ++;}
            if ((mat == 3)&&(gen == 0)){prom3 += nt;ct3 ++;}     
            // se realiza el comparativo de los datos que sea la materia 1 = historia 
            // luego que hace el algoritmo para buscar el numero mayor 
            if ((nt > mayor)&&(mat == 1)) {
                mayor = nt;
                mayorest = es; 
            }
            
        }
        
        // se sacan las variables 
        prom1 = prom1/ct1;
        prom2 = prom2/ct2;
        prom3 = prom3/ct3;
       
        //1. ¿Cuál es el desempeño promedio de todo el grupo?
        float promedio = suma/n;
        System.out.printf("%.2f %n", promedio);
        System.out.println(contRegulares);
        // se mostrara en pantalla los valores condicionales 
        // dcual es la materia con menor 
        //●	¿Cuál es la materia con el peor desempeño promedio para el género masculino?
        if ((prom1 < prom2 )&&( prom1 < prom3)){System.out.println("historia");}
        if ((prom2 < prom1 )&&( prom2 < prom3)){System.out.println("literatura");}
        if ((prom3 < prom1 )&&( prom3 < prom2)){System.out.println("biologia");}
        //¿Cuál es el estudiante con el mejor desempeño para la materia historia?
        if (mayorest == 1){System.out.println("armando");}
        if (mayorest == 2){System.out.println("nicolas");}
        if (mayorest == 3){System.out.println("daniel");}
        if (mayorest == 4){System.out.println("maria");}
        if (mayorest == 5){System.out.println("marcela");}
        if (mayorest == 6){System.out.println("alexandra");}
        
       
        
        input.close();
        
        
    }
}