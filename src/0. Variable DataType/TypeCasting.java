
public class TypeCasting {
    public static void main(String[] args) {
        // Type casting = a process of turning one data type to other data type

        // 1. Implicit casting ( widening ) : to convert one data type to another thru arithmatic operation.

        short myShort = 1;

        double myDouble1 = 1.1 + myShort;

        System.out.println(myDouble1);

        // 2. Explicit casting ( narrowing ) : to convert value from one dayatype to another using hava builtin function

        // convert String to double or int
        String numStr = "20";

        // we need to use the big Double and Interger instead of double or int for this to work
        Double toDouble = Double.parseDouble(numStr);
        Integer toInt = Integer.parseInt(numStr); // if the string is a float, error will occur


        System.out.println(toDouble);
        System.out.println(toInt);


    }
    
}
