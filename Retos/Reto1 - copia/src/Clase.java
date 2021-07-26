
import java.util.Scanner;

import javax.lang.model.util.ElementFilter;

import java.security.Principal;
import java.util.*;
public class Clase {

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
    int n = 0;
    


    public void leer() {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();// numero de estudiantes
        input.nextLine();

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

              }
        
    }

    public void respuesta1() {
        //1.	¿Cuál es el desempeño promedio de todo el grupo?

        
            float promedio = suma/n;
            System.out.printf("%.2f %n", promedio);
        
        
    }
    public void respuesta2() {
        //2.	¿Cuántos exámenes tienen una calificación Regular?
        
            
            if (nt > 2.5 && nt <= 3.5) {
                contRegulares ++;  
                System.out.println(contRegulares);
                
            
        }
        
        System.out.println(nt);
        System.out.println(contRegulares);


           

        
    }
    
    public void  respuesta3() {
        prom1 = prom1/ct1;
        prom2 = prom2/ct2;
        prom3 = prom3/ct3;
        for (int i = 0; i < n; i++) {
        if ((mat == 1)&&(gen == 0)){prom1 += nt;ct1 ++;}
        if ((mat == 2)&&(gen == 0)){prom2 += nt;ct2 ++;}
        if ((mat == 3)&&(gen == 0)){prom3 += nt;ct3 ++;} 
        if ((prom1 < prom2 )&&( prom1 < prom3)){System.out.println("historia");}
        if ((prom2 < prom1 )&&( prom2 < prom3)){System.out.println("literatura");}
        if ((prom3 < prom1 )&&( prom3 < prom2)){System.out.println("biologia");}
            
        }
        //3.	¿Cuál es la materia con el peor desempeño promedio para el género masculino?

           
        

        
    }

    public void respuesta4() {

        if ((nt > mayor)&&(mat == 1)) {
            mayor = nt;
            mayorest = es; 
        }
        //¿Cuál es el estudiante con el mejor desempeño para la materia historia?
        if (mayorest == 1){System.out.println("Armando");}
        if (mayorest == 2){System.out.println("nicolas ");}
        if (mayorest == 3){System.out.println("daniel");}
        if (mayorest == 4){System.out.println("maria");}
        if (mayorest == 5){System.out.println("marcela");}
        if (mayorest == 6){System.out.println("alexandra");}

        
    }


    
}
