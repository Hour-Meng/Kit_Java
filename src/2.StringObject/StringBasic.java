public class StringBasic{
    public static void main(String[] args){

        //How to declare a string

            String str1 = "George!";
            
        //1. Counting string characters
            int countStr = str1.length();
            System.out.println(countStr);


        //2. String concatination
            String startString = "Hello";
            String strConcatination = startString + " : " + str1;
            System.out.println(strConcatination);
        //3. String methods for UpperCase, LowerCase, Capitalize
            String strToUpperCase = str1.toUpperCase();
            System.out.println(strToUpperCase);


            String strToLower = str1.toLowerCase();
            System.out.println(strToLower);


            //capitalize a string
            String str2 = "unhappy";

            String subStr1 = str2.substring(0, 1);
            String outputStr = subStr1.toUpperCase() + str2.substring(1);

            System.out.println(outputStr);

            //Library fro Text formatting: apache commons lang3


        //4. String method for startWith(), endWith()
            String startWith = "H";
            System.out.println(startString.startsWith(startWith));
            
            String endWith = "y";
            System.out.println(str2.endsWith(endWith));
        //5. String formatting 

        //6. String splitting( using regular expression )

            System.out.println(str1.substring(0, 3));

        //7. String Matching(Regular Expression) 

            String rule = "Dog|Cat";

            String sentence1 = "Dog";

            System.out.println(sentence1.matches(rule));

    }
}
       

