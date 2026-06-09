import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        // Array list: Optimized tool selectionAn ArrayList is a resizable list that stores elements in order 
        // and lets you access them by index. 
        // In Java, it behaves like an array, but its size can grow or shrink automatically as you add or remove items.
        
    
        // ArrayList<Datatype> = new Arraylist<>(Arrays.asList());
        
        Integer age = 22;

        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("Mango", "Cherry"));
        System.out.println(fruitList.toString());


        // Remember int will not work with array list, so I must use Integer
        ArrayList<Integer> ageArray = new ArrayList<>(Arrays.asList(2,3,4));
        System.out.println(ageArray.toString());


        // Unpack

        for(String fruit: fruitList){

            System.out.println(fruit);

        } // Print it out one by one

        // Append

        fruitList.add(1, "Pineapple");

        System.out.println(fruitList.toString());


        ageArray.add(age);
        System.out.println(ageArray.toString());

        //Remove

        fruitList.remove(1); // remove based on index

        fruitList.remove("Pineapple"); // remove based on name

        System.out.println(fruitList.toString());




    }

    


}
