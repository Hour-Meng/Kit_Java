package Assignments.Assignment2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * ORIGINAL VERSION — kept for comparison with the updated StudentPerformance.java.
 * This version uses ArrayList (not arrays) and does not include all assignment requirements.
 */
public class StudentPerformance_Original {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> subjects = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();


        subjectsList(subjects, sc);
        scoresList(scores, subjects, sc);
        giveResult(scores, subjects);
        
        sc.close();
    }
    

    private static List<String> subjectsList(List<String> subjects , Scanner sc){
        // Variables
        String subject;
        String formattedSubject;

        // for loop for subjects

        System.out.println("\n\nEnter 4 of your subjects");

        for ( int i = 0; i < 4; i ++){

            System.out.print("Please enter the subject: ");
            subject = sc.nextLine();
            formattedSubject = subject.substring(0,1).toUpperCase() + subject.substring(1).toLowerCase();
            subjects.add(formattedSubject);
            
        }

        System.out.println("\nThe 4 subjects are: ");
        for (int i = 0 ; i < 4; i++){
            if ( i < 3){

                System.out.print(subjects.get(i) + ", ");
            }
            else{
                System.out.println(subjects.get(i));
            }
        }

        return subjects;
    }

    private static List<Integer> scoresList(List<Integer> scores, List<String> subjects, Scanner sc){
            // Variables
            int score;
            

            System.out.println("\nPlease enter your score based on each subject: ");

            // for loop for scores
            for ( int i = 0; i < 4; i++){

                System.out.print("Please enter the score of " + subjects.get(i) + ": ");
                
                score = sc.nextInt();

                while (score < 0 || score > 100){

                    System.out.print("Please enter the score of " + subjects.get(i) + ": ");
                    
                    score = sc.nextInt();


                }

                scores.add(score);

            }
        

       return scores; 
    }

    private static void giveResult(List<Integer> scores, List<String> subjects){

        int total = 0;
        String grade;

        for (int i = 0; i < 4; i++){
            total += scores.get(i);
        }

       double avg = total / 4.0;

        // Print out each score and subject with grades, then total and avg score
        System.out.println("\n===================================================================");
        System.out.println("This is your final report");
        System.out.println("===================================================================");
        System.out.println("Subject      Score      Grade\n");

        for (int i = 0; i < 4; i++){
            switch (scores.get(i) / 10) {
                case 10 -> grade = "A+";
                case 9 -> grade = "A";
                case 8 -> grade = "B";
                case 7 -> grade = "C";
                case 6 -> grade = "C";
                case 5 -> grade = "F";

                default -> grade = "F";


            }

            String whitespace = " ".repeat(15 - subjects.get(i).length());
            String whitespaceN = " ".repeat(10 - scores.get(i).toString().length());

            System.out.println(subjects.get(i) + whitespace + scores.get(i) + whitespaceN + grade);


        }

        System.out.println("\n===================================================================");
        System.out.println("Total Score      Average Score");
        System.out.println(total + " ".repeat(18 - Integer.toString(total).length()) + avg);
    }
}
