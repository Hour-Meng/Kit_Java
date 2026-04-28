import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerClass {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\n\nPlease enter your name: ");

        String name = sc.nextLine();

        System.out.print("Please enter your age: ");

        int age = sc.nextInt();

        System.out.printf("\nStudents information: \nname: %s\nage: %d\n", name, age);

        sc.close();

    // other choice

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter your name: ");
    
    String name2 = bf.readLine();

    System.out.println("Hello " + name2);

    }
}


