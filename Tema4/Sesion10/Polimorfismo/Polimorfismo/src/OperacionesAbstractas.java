import java.util.*;
public abstract class OperacionesAbstractas {
//abstract 
        protected int num1, num2, num3;
            Scanner leer = new Scanner(System.in);
        public void pedirDatos(){
            System.out.println("digite un numero");
            num1 = Integer.parseInt(leer.nextLine());
            System.out.println("digite otro numero");
            num2 = Integer.parseInt(leer.nextLine());
        }

        public abstract void Operacion(); 
        public int mostrarresultado(){
            return num3;
        }
            
        

}
