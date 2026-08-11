class Student {

    // Private attributes
    private String name;
    private int age;

    // Setter for name
    void setName(String studentName) {
        name = studentName;
    }

    // Getter for name
    String getName() {
        return name;
    }

    // Setter for age
    void setAge(int studentAge) {
        age = studentAge;
    }

    // Getter for age
    int getAge() {  
        return age;
    }

    // Display method
    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}


public class Encapsulation {

        public static void main(String[] args) {

        Student student1 = new Student();

        // Setting values using setter methods
        student1.setName("Dara");
        student1.setAge(20);

        // Getting values using getter methods
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());

        System.out.println();

        student1.displayStudent();
    }
    
}