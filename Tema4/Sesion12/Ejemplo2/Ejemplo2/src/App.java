public class App {
    public static void main(String[] args) throws Exception {
        Telefono array[] = new Telefono[3];
        array[0] = new Motorola("Android","model","blackRed","1Gb");
        array[1] = new Biox("Android10","mode2","blackbLUE","2Gb");
        array[2] = new Motorola("Android11","mode3","blackGreen","3Gb");

        for (Telefono i : array) {
            if(i instanceof Telefono){
                System.out.println("Si es una instancia de telefono ");
            } else System.out.println("NO es una instancia de telefono  ");
        }

    }
}
