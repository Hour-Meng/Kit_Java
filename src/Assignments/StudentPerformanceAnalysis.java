package Assignments;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class StudentPerformanceAnalysis {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Lists
        List<Integer> scores = new ArrayList<>();
        List<String> subjects = new ArrayList<>();

        // Variables 
        String subject;
        String formattedSubject;
        String grade;
        int score;
        int total = 0;
        double avg;

        System.out.println("\n\nEnter 4 of your subjects");

        // for loop for subjects
        for ( int i = 0; i < 4; i ++){

            System.out.print("Please enter the subject: ");
            subject = sc.nextLine();
            formattedSubject = subject.substring(0,1).toUpperCase() + subject.substring(1).toLowerCase();
            subjects.add(formattedSubject);
            
        }

        System.out.println("The 4 subjects are: ");
        for (int i = 0 ; i < 4; i++){
            System.out.print(subjects.get(i) + " ");
        }

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

        for (int i = 0; i < 4; i++){
            total += scores.get(i);
        }

        avg = total / 4;

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
        sc.close();
    }

        public static List<String> getStringList() {
            List<String> list = new ArrayList<>();
            list.add("Hello");
            list.add("World");
            return list;
        }

}