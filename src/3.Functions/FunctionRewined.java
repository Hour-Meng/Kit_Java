
public class FunctionRewined {
    public static void main(String[] args) {
        
        System.out.println(greet("Meng"));
        System.out.println(addDouble(19.41, 23.4));
    }

    private static String greet(String name){

        return "\nWelcome, " + name;
    }

    private static double addDouble(double a, double b){
        double c = a + b;

        return c;
    }
}
