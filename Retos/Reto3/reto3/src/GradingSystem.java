public class GradingSystem {
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
    protected int cantDatos;
    protected String[][] datos;
    
    public float  stat1(){
        float sum = 0;
        for (int k = 0; k < cantDatos; k++){
            sum += Float.parseFloat(datos[k][3]);
        }
        return sum /cantDatos;
    }
    public float stat2(){
        int cont=0;
        
        for (int i = 0; i < cantDatos; i++) {
        nt = Double.parseDouble(datos[i][3]);
            if (nt > 2.5 && nt <= 3.5)
            cont ++;
        }
        return cont++;
    }
    public String stat3(){
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
        String result = "";
        if ((prom1 < prom2 )&&( prom1 < prom3)){result="historia";}
        if ((prom2 < prom1 )&&( prom2 < prom3)){result="literatura";}
        if ((prom3 < prom1 )&&( prom3 < prom2)){result="biologia";}
        return result;
    }
    public String stat4(){
        
       
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
        String result = "";
        
        if (mayorest == 1){result="armando";}
        if (mayorest == 2){result="nicolas";}
        if (mayorest == 3){result="daniel";}
        if (mayorest == 4){result="maria";}
        if (mayorest == 5){result="marcela";}
        if (mayorest == 6){result="alexandra";}
        return result;
    }
}