// Interface
interface Printable {

    void print();
}


// First class implementing the interface
class Student implements Printable {

    String name;
    int studentId;

    Student(String studentName, int id) {
        name = studentName;
        studentId = id;
    }

    @Override
    public void print() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
}


// Second class implementing the same interface
class Certificate implements Printable {

    String title;
    String studentName;

    Certificate(String certificateTitle, String name) {
        title = certificateTitle;
        studentName = name;
    }

    @Override
    public void print() {
        System.out.println("Certificate: " + title);
        System.out.println("Awarded to: " + studentName);
    }
}


public class InterfaceDemo {

    public static void main(String[] args) {

        Student student1 =
                new Student("Dara", 1001);

        Certificate certificate1 =
                new Certificate(
                        "Java Programming",
                        "Dara"
                );

        student1.print();

        System.out.println();

        certificate1.print();
    }
}
