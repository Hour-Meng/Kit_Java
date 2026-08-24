class People{
    String name;
    int age;
    
    // Constructor
    People(String peopleName, int peopleAge){
        name = peopleName;
        age = peopleAge;
    }

    // method

    void introduce(){
        System.out.printf("\nHello, I am %s and I am %d\n", name, age);
    }
}

class Student extends People {
    
    Student(String name, int age) {
        super(name, age);
    }

    @Override
    void introduce() {
        System.out.printf("\nHello I am %s and I am a student!\n", name);
    }
}

public class MyPolymorphism {
    public static void main(String[] args) {
        
        People person = new People("Rodinho", 22);
        Student student1 = new Student("HourMeng", 99);

        person.introduce();
        student1.introduce();
    }
}
