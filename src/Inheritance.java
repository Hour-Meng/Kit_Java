// Parent class
class Person {

    String name;
    int age;

    // Constructor
    Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class

// the word extends mean a is an inheritance of b
class Student extends Person {

    int studentId;
    String course;

    // Constructor
    Student(String name, int age, int id, String studentCourse) {

        // Calling the parent class constructor
        super(name, age);

        studentId = id;
        course = studentCourse;
    }

    void displayStudent() {
        displayPerson();

        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Student student1 =
                new Student("Sokha", 21, 1001, "Java Programming");

        student1.displayStudent();
        student1.displayPerson();
    }
}