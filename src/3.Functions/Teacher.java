
// public, private, default, protected
class School {
    public static String room = "a";
    public static String Subject = "Math";

    public static void Announce(){

        System.out.println("Student study at room " + room + " with a " + Subject + " subject");
        
    }

}

class Student extends School{
    
    public static void main(String[] args) {
        
        System.out.println(School.room);
    }
}

public class Teacher extends School{
    public static void main(String[] args) {
        String s = Subject;

        System.out.println(s);
        Announce();
    }
}