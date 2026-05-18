import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Regex1 {

    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("cat|dog");
        Scanner sc = new Scanner(System.in);

        System.out.print("Guess my favorite pet: ");
        String usrInput = sc.nextLine();

        Matcher match = pattern.matcher(usrInput.toLowerCase());

        boolean check = match.find();

        System.out.println(check);


        sc.close();
    }
    
}
