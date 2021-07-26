import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int magic_square[][]=new int[3][3];
        int counter = 0;
        while(true){
            System.out.println("Enter the Magic Number: ");
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    System.out.println("Number "+(i+1)*(j+1));
                    magic_square[i][j] = input.nextInt();
                        if (magic_square[i][j] < 1 || magic_square[i][j] > 9)
                            System.out.println("ERROR! Input range is invalid.");
                        else
                             counter++;
                }
            }
        }
    }
}    
            


