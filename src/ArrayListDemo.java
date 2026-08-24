import java.util.ArrayList;


class Student {

    private int studentId;
    private String name;
    private double mark;

    // Constructor
    Student(int id, String studentName, double studentMark) {
        studentId = id;
        name = studentName;
        mark = studentMark;
    }

    // Getter methods
    int getStudentId() {
        return studentId;
    }

    String getName() {
        return name;
    }

    double getMark() {
        return mark;
    }

    // Calculate grade
    String calculateGrade() {

        if (mark >= 80) {
            return "A";
        } else if (mark >= 70) {
            return "B";
        } else if (mark >= 60) {
            return "C";
        } else if (mark >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Display student information
    void displayStudent() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + calculateGrade());
    }
}


public class ArrayListDemo {

    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<Student> students =
                new ArrayList<>();


        // Create Student objects
        Student student1 =
                new Student(1001, "Dara", 85);

        Student student2 =
                new Student(1002, "Sokha", 72);

        Student student3 =
                new Student(1003, "Malis", 48);


        // Add objects to ArrayList
        students.add(student1);
        students.add(student2);
        students.add(student3);


        // Display all students
        for (Student student : students) {

            student.displayStudent();

            System.out.println();
        }
    }
    
}
