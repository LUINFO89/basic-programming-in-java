public class App {
    public static void main(String[] args) throws Exception {
        
        SchoolGradingSystem shool = new SchoolGradingSystem();
        
        shool.loadData();
        System.out.printf("%.2f %n",shool.stat1());
        System.out.printf("%.0f %n",shool.stat2());
        System.out.printf("%s%n",shool.stat3());
        System.out.printf("%s",shool.stat4());
       
    }
}