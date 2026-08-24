package Assignments;

// Part 1
interface Printable {
    void printDetail();
}

// Part 2
abstract class Employee {
    private String name;
    private int age;
    private int employeeId;
    private String department;
    private double salary;

    // part 3
    void setName(String employeeName) {
        name = employeeName;
    }
    String getName() {
        return name;
    }

    void setAge(int employeeAge) {
        age = employeeAge;
    }
    int getAge(){
        return age;
    }

    void setId(int employeeID) {
        employeeId = employeeID;
    }

    int getEmployeeId() {
        return employeeId;
    }

    void setDepartment(String employeeDepartment) {
        department = employeeDepartment;
    }
    String getDepartment() {
        return department;
    }

    void setSalary(double employeeSalary) {
        salary = employeeSalary;
    }

    double getSalary() {
        return salary;
    }

    // part 4

    Employee(String name, int age, int employeeId, String department, double salaray) {

        setName(name);
        setAge(age);
        setId(employeeId);
        setDepartment(department);
        setSalary(salaray);

    }

    // part 5

    void displayBasicInformation() {
        System.out.printf("\nName: %s\nAge: %d\nEmployee ID: %d\nDepartment: %s\nSalary: %.2f", getName(), getAge(), getEmployeeId(), getDepartment(), getSalary());
    }

    // part 6

    abstract void work();
}

// part 7

class Teacher extends Employee implements Printable {
    
    private String subject;

    void setSubject(String teachingSubject) {
        subject = teachingSubject;
    }

    String getSubject() {
        return subject;
    }

    // part 8

    Teacher(String name, int age, int employeeId, String department, double salaray, String subject) {
        super(name, age, employeeId, department, salaray);
        setSubject(subject);

    }

    // part 9
    @Override
    void work() {
        System.out.printf("%s teaches %s\n", getName(), getSubject());
    }

    // part 10
    @Override
    public void printDetail() {
        displayBasicInformation();
        System.out.printf("\nSubject: %s\n", subject);
        work();
    }



}

// part 11
class Programmer extends Employee implements Printable{
    private String programmingLanguage;

    void setLanguage(String program) {
        programmingLanguage = program;
    }

    String getLanguage() {
        return programmingLanguage;
    }

    // part 12

    Programmer(String name, int age, int id, String department, double salary, String language) {
        super(name, age, id, department, salary);
        setLanguage(language);
    }

    // part 13
    @Override
    void work() {
        System.out.printf("\n%s develops software using %s\n", getName(), getLanguage());
    }

    // part 14
    @Override
    public void printDetail() {
        displayBasicInformation();
        System.out.printf("\nProgramming Language: %s", getLanguage());
        work();
    }
}

// part 15
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Teacher teacher1 =new Teacher("Ronaldo",30,01,"Computer Science",3000,"Java Programming");
        Programmer programmer1 =new Programmer("Pheng",27,02,"Software Engineer",1800,"Java");

        // part 16
        teacher1.printDetail();
        programmer1.printDetail();

        // part 17
        teacher1.setSalary(5000);
        programmer1.setLanguage("Lua");

        teacher1.printDetail();
        programmer1.printDetail();

        // part 18
        Employee employee1 = programmer1;
        Employee employee2 = teacher1;

        employee1.work();
        employee2.work();

        // part 19

            /*  employee is an abstract class because by being an abstract class
             it doesn't allow a new object to be created by using itself as a constructor.
             Instead the child class of Employee needed to be created then assign that object
             to employee instead.

             Class structure:

             [Programmer, Teacher] --> [Employee]
            */ 

        /*
        Questions and Answers:

            1.What is encapsulation?
            Encapsulation is wrapping many functions into one main function

            2.Why are the attributes declared private?
            The attributes that declared private are:
                name, age, employeeId, department, salary, subject, programmingLanguage

            3.What is inheritance?
            Inheritance is it inherit from the parent class and has access to attributes and methods that contain in the parent class


            4.Why does Teacher extend Employee?
            Teacher entend Employee because Teacher inherit from employee, this mean that employee is a parent class of teacher

            5.Why does Programmer extend Employee?
            Programmer entend Employee because programmer inherit from employee, this mean that employee is a parent class of programmer

            6.What is the purpose of super()?
            super() is to allow child class to use attributes that exist in the parent class

            7.What is an abstract class?
            abstract class is a class that doesn't allow to be created as a new object by using itself as a constructor

            8.Why is Employee declared abstract?
            employee is declared as an abstract class because by being an abstract class
            it doesn't allow a new object to be created by using itself as a constructor.
            Instead the child class of Employee needed to be created then assign that object
            to employee instead.
            
            9.What is an abstract method?
            Abstract method is a type of method that needed to exist in every child class that inherit from it.

            10.Why must Teacher and Programmer implement work()?
            Teacher and Programmer must implement work because it inherit from a parent class which has an abstract method

            11.What is an interface?
            Interface is a type of method that can be used in multiple classes
            
            12.What does implements Printable mean?
            Implements Printable mean, that class add an interface which name Printable

            13.What is the difference between extends and implements?
            Extends is for inherit while implements is for interface

            14.What is method overriding?
            Method overriding is to modify and use an existing method which has the same name

            15.How does your program demonstrate polymorphism?
            My program demonstrate polymorphism by creating teacher1, programmer1 object then assign it into employee1 and employee2.


            No AI were used
        
        */
    }

    
}
