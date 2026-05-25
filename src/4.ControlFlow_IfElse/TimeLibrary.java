import java.time.LocalDate;
import java.time.LocalTime;


public class TimeLibrary {

    public static void main(String[] args) {
        
        // Get the current time
        int lt = LocalTime.now().getHour();

        if (lt < 12){
            System.out.println("Good morning");
        }
        else if(lt < 17){
            System.out.println("Good afternoon");
        }
        else if(lt < 22 ){
            System.out.println("Good evening");
        }
        else if( lt < 25){
            System.out.println("Good night");
        }

    }
}
