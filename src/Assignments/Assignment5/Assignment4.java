package Assignments.Assignment5;

class Person{


    private String name;
    private int age;


    //setter for name
    void setName(String personName){
        name = personName;
    }

    //getter for name
    String getName(){
        return name;
    }

    // setter for age

    void setAge(int personAge){
        age = personAge;
    }

    // getter for age
    int getAge(){
        return age;
    }

    // constructor

    Person(String name, int age){
        // construct by using set method
        setName(name);
        setAge(age);

    }


    void displayPerson(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

}

class Employee extends Person{

    private int employeeId;
    private String department;
    private double salary;


    // setter for employeeId
    void setEmployeeId(int id){
        employeeId = id;
    }

    // getter for employeeId
    int getEmployeeId(){
        return employeeId;
    }
    

    // setter for department
    void setDepartment(String departmentName){
        department = departmentName;
    }
    

    // getter for department

    String getDepartment(){
        return department;
    }

    // setter for salary
    void setSalary(double employeeSalary){
        salary = employeeSalary;
    }

    //getter for salaray
    double getSalary(){
        return salary;
    }

    // constructor for employee

    Employee(String name, int age, int id, String department, double salaray){
        // inheritance
        super(name, age);

        // use setter method
        setEmployeeId(id);
        setDepartment(department);
        setSalary(salaray);

    }

    // display it

    void displayEmployee(){
        // display Person's detail first

        displayPerson();

        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Dapartment: " + getDepartment());
        System.out.println("Salary: " + getSalary());


    }

}

public class Assignment4 {

    // create employee object

    public static void main(String[] args) {

        Employee employee1 = new Employee("HourMeng", 18, 01, "SE", 100);
        Employee employee2 = new Employee("Tharo", 19, 02, "SE",    100);
        Employee employee3 = new Employee("Bunlong", 19, 03, "IT", 200);

        // display all of the information
        employee1.displayEmployee();
        System.out.println();
        employee2.displayEmployee();
        System.out.println();
        employee3.displayEmployee();
        System.out.println();

        // modify employee's data

        employee2.setSalary(200);
        
        // display the modified data

        employee2.displayEmployee();


        
    }
    
}
