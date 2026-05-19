import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Regax2 {

    // instruction

    // Import Scanner, regex.Matcher, regex.Pattern

    /*
    
    create Pattern object ( Pattern.compile )

    use Scanner

    create Matcher object ( [our pattern].matches([our input]) )

    
    */
    public static void main(String[] args) {
        //Create a regax checker

        Pattern pt = Pattern.compile("^[a-zA-Z0-9.-.]+@+[a-zA-Z.-_]+\\.[a-zA-Z]{2,}$");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.next();

        Matcher match = pt.matcher(email);

        boolean isValidEmail = match.find();

        System.out.println(isValidEmail);


        sc.close();

        if (isValidEmail){
            String name = email.substring(0, email.indexOf("@"));
            System.out.printf("\nHello %s\n", name);
        }
    }    
}
