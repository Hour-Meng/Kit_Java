import java.util.Scanner;


public class NumberChecker {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int userInput = sc.nextInt();


        if (userInput >=0 ){
            
            if (userInput == 0){
                System.out.println("Zero");
            }
            else{

                System.out.println("Positive");
            }

        }
        else{
            System.out.println("Negative");
        }

        sc.close();
    }
}
