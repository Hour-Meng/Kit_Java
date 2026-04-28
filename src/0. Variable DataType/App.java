public class App {
    public static void main(String[] args) throws Exception {


        // String, int, double, boolearn are primitive data type!

        String name = "George";
        int age = 18;
        boolean isSingle = true;

        String singleOr = (isSingle) ? "You are single" : "You are not single";


        System.out.printf("Hello,%s you are %d and you are %s\n", name, age, singleOr);
    }
}
