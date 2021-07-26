import java.util.Scanner;

public class SchoolGradingSystem {
    
    private int cantDatos;
    private String[][] datos;
        
        int ct1 = 0;
        int ct2 = 0;
        int ct3 = 0;
        double nt = 0;
        double gen = 0;
        double mat = 0;
        double es = 0;
        float prom1= 0.00f;
        float prom2= 0.00f;
        float prom3= 0.00f;
        double mayor = 0;
        double mayorest = 0;
        
    

    public void readData(){

        Scanner input = new Scanner(System.in);
    try{
        cantDatos = Integer.parseInt(input.nextLine());
        datos = new String[cantDatos][4];

        for (int i = 0; i < cantDatos; i++) {

            String vector[] = input.nextLine().split(" ");
            for (int j = 0; j < 4; j++) {
                datos[i][j] =  vector[j];
            }           
        }
    input.close();
    }catch(NumberFormatException ex){
        cantDatos = Integer.parseInt(input.nextLine());
        datos = new String[cantDatos][4];

        for (int i = 0; i < cantDatos; i++) {

            String vector[] = input.nextLine().split(" ");
            for (int j = 0; j < 4; j++) {
                datos[i][j] =  vector[j];
            }       
        }
    }
    input.close();      
    }



    public float question1(){
        float sum = 0;
        for (int k = 0; k < cantDatos; k++){

            sum += Float.parseFloat(datos[k][3]);
        }
        return sum /cantDatos;


    }

    public float question2(){

        int cont=0;
        
        for (int i = 0; i < cantDatos; i++) {
        nt = Double.parseDouble(datos[i][3]);
            if (nt > 2.5 && nt <= 3.5)
            cont ++;
        }

        return cont++;
    }

    public void question3(){

        for(int i =0; i < cantDatos; i++){
            nt = Double.parseDouble(datos[i][3]);
            mat = Double.parseDouble(datos[i][2]);
            gen = Double.parseDouble(datos[i][1]);
               
            if ((mat == 1)&&(gen == 0)){prom1 += nt;ct1 ++;}
            if ((mat == 2)&&(gen == 0)){prom2 += nt;ct2 ++;}
            if ((mat == 3)&&(gen == 0)){prom3 += nt;ct3 ++;}
            
            
        }
        prom1 = prom1/ct1;
        prom2 = prom2/ct2;
        prom3 = prom3/ct3;
   
        if ((prom1 < prom2 )&&( prom1 < prom3)){System.out.println("historia");}
        if ((prom2 < prom1 )&&( prom2 < prom3)){System.out.println("literatura");}
        if ((prom3 < prom1 )&&( prom3 < prom2)){System.out.println("biologia");}

    }

    public void question4(){
        
       
        for(int i =0; i < cantDatos; i++){
            mat = Float.parseFloat(datos[i][2]);
            gen = Float.parseFloat(datos[i][1]);
            nt = Float.parseFloat(datos[i][3]);
            es = Float.parseFloat(datos[i][0]);
        
        if ((nt > mayor)&&(mat == 1)) {
                mayor = nt;
                mayorest = es; 
            }
        }
        
        if (mayorest == 1){System.out.println("armando");}
        if (mayorest == 2){System.out.println("nicolas");}
        if (mayorest == 3){System.out.println("daniel");}
        if (mayorest == 4){System.out.println("maria");}
        if (mayorest == 5){System.out.println("marcela");}
        if (mayorest == 6){System.out.println("alexandra");}

    }



}
