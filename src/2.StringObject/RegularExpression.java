
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class RegularExpression {
    public static void main(String[] args) {
        //Definition
        //Regular Expression(Regax) is set of expression charecters that is used to identify a string pattern and matching.

        //To use Regex in java, you need 
        //Email: bkj@gmail.com 
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the password: ");
        String usrPass = sc.nextLine();

        Pattern passcode = Pattern.compile("1234"); // Main password

        Matcher passcodeInput = passcode.matcher(usrPass); // Where we compare between the passcode and usrPass ( It return a matcher )

        boolean check = passcodeInput.find();

        if (check){
            System.out.println("Correct password");

        }
        else{
            System.out.println("Incorrect password!");
        }

        sc.close();
    }
    
}
