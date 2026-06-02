import java.util.Scanner;

public class Increment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        while (true) {
            System.out.print("Please enter a numer: ");
            int num = sc.nextInt();
            sc.nextLine();


            total += num;

            System.out.println("The total num is: " + total + "\n");

            System.out.print("Press q to quit: ");
            String quit = sc.nextLine();

            if (quit.equals("q")) {
                
                System.out.println("Goodbye!");
                break;
                
            }
            
        }

    }
    
}
