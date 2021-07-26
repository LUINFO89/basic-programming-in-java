public class App {
    public static void main(String[] args) throws Exception {
        
        SchoolGradingSystem shool = new SchoolGradingSystem();

        
        shool.readData();

        System.out.printf("%.2f %n",shool.question1());
        System.out.printf("%.0f %n",shool.question2());
        shool.question3();
        shool.question4();
    }
}
