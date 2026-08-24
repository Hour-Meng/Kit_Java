interface introduce {
    void print();
}

class Person implements introduce{

    String name;
    int age;

    Person(String personName, int personAge){
        name = personName;
        age = personAge;
    }

    @Override
    public void print() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);

    }

}

class Student implements introduce{
    String name;

    Student(String studentName){
        name = studentName;
    }

    @Override
    public void print( ){
        System.out.println("My name is " + name + " and I am a student");
    }
}


public class MyInterfaceDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Soda", 12);
        Student student1 = new Student("Sokleng");

        person1.print();
        student1.print();
    }    
}
