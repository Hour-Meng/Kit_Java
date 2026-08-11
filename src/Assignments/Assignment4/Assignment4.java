package Assignments.Assignment4;

class CourseStudent{

    String name;
    String courseName;
    int assignmentMark;
    int examMark;

    CourseStudent(String studentName, String CourseName, int AssignmentMark, int ExamMark){
        name = studentName;
        courseName = CourseName;
        assignmentMark = AssignmentMark;
        examMark = ExamMark;
    }

    // calculate the mark
    double calculateFinalMark(){
        return (assignmentMark * 0.40) + (examMark * 0.60);
    }

    // calcute the grade

    String calculateGrade(double finalMark){
        String grade;

        if (finalMark >= 80 && finalMark <= 100){
            grade = "A";
        }
        else if (finalMark >= 70 && finalMark <= 79){
            grade = "B";
        }
        else if ( finalMark >= 60 && finalMark <= 69){
            grade = "C";
        }
        else if ( finalMark >= 50 && finalMark <= 59){
            grade = "D";
        }
        else{
            grade = "F";
        }

        return grade;
    }

    String determineResult(double finalMark){
        if (finalMark >= 50){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }

    void displayResult(){
        double finalMark = calculateFinalMark();
        String grade = calculateGrade(finalMark);
        String result = determineResult(finalMark);

        System.out.printf("\n\nStudent Name: %s\nCourse Name: %s\nAssignment Mark: %d\nExam Mark: %d\nFinal Mark: %.2f\nGrade: %s\nResult: %s\n", name, courseName, assignmentMark, examMark, finalMark, grade, result);
    }

}

public class Assignment4 {

    public static void main(String[] args){

        CourseStudent student1 = new CourseStudent("Dara", "Java Programming", 75, 80);
        CourseStudent student2 = new CourseStudent("Sokha", "Java Programming", 60, 55);
        CourseStudent student3 = new CourseStudent("Malis", "Java Programming", 40, 45);

        student1.displayResult();
        student2.displayResult();
        student3.displayResult();

    }


    
}
