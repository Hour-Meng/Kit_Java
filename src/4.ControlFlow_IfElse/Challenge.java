import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        /*
        Case 1 = Int divisible by 3 ( FIZZ )
        Case 2 = Int is divisible by 5 ( BUZZ )
        Case 3 = Int both divisible by 3 and 5 ( FIZZ and BUZZ )
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int userInput = sc.nextInt();

        if( userInput % 3 == 0 && userInput % 5 == 0){
            System.out.println("FIZZ and BUZZ");
        }
        else if (userInput % 3 == 0){
            System.out.println("FIZZ");
        }
        else if( userInput % 5 == 0){
            System.out.println("BUZZ");
        }
        else{
            System.out.println("None");
        }

        sc.close();
    }
}
