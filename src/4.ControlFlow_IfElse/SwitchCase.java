import java.util.Scanner;
public class SwitchCase {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the day: ");
        String day = sc.nextLine();

        day = day.toLowerCase();
        String head = day.substring(0,1).toUpperCase();
        day = head + day.substring(1);

        switch (day) {
           case "Monday" -> System.out.println("Workday");
           case "Tuesday" -> System.out.println("Workday");
           case "Wednesday" -> System.out.println("Workday");
           case "Thursday" -> System.out.println("Workday");
           case "Friday" -> System.out.println("Workday");
           case "Saturday" -> System.out.println("Weekend");
           case "Sunday" -> System.out.println("Weekend");


           default -> System.out.println("You are a troll");

        }

        System.out.println(day);

        if(day == "Monday"){
            System.out.println("Monday");
        }
        else if(day == "Tuesday"){
            System.out.println("Same");
        }
        else{
            System.out.println("I don't know");
        }

        System.out.println(day);

    sc.close();   
    }
    
}
