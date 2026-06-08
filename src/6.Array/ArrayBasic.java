import java.util.ArrayList;
import java.util.Arrays;

public class ArrayBasic {

    
    public static void main(String[] args) {
        // What is an array?
        
        /*  
            - It is a non primitie data type basically a table, list
            - In java array can be fixed size or dynamic size. It's also mutable ( CRUD )
            - It can be 1 dimension or multi dimensions.

        */

        // Create an Array

        String[] fruitArray  = new String[4];

        fruitArray = new String[]{"Mango", "Coconut", "Berry", "Strawberry"};

        // read the array

        System.out.println(fruitArray[0]);

        for(int i = 0; i < fruitArray.length ; i ++){

            System.out.println(fruitArray[i]);

        }

        // Update the Array

        fruitArray[1] = "Banana";

        // fruitArray[1]: Coconut --> Banana

        System.out.println(fruitArray[1]);

        // search the target

        String target = "Banana";
        System.out.println("\n\n" + "This is for searching target \n\n");
        for (int j = 0; j < fruitArray.length ; j++){
            
            if (fruitArray[j] == target){
                System.out.println("Found the target: " +  target + " at index " + (j));
                break;
            }

            else if (fruitArray[j] != target && j+1 == fruitArray.length){
                System.out.println("Not found");
            }
        }

        // Binaray search ( you first need to import java.util.Arrays;)
        // Note that for the binary search to work, you will need it to be sorted first
        int[] scoreArray = new int[]{12, 15, 21,23, 62, 75, 90};

        int scoreTarget = 23;

        int binarySearch = Arrays.binarySearch(scoreArray, scoreTarget);
        System.out.println("\n\n" + "This is binaray search" + "\n\n");
        if (binarySearch > 0){
            System.out.println("Found the Target: " + scoreTarget + " at index " + binarySearch);

        }
        else{
            System.out.println("Not found");
        }
        
    }

}
