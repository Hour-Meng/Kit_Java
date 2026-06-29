// each interface can only has one functional interface in it

interface InnerLambdaBasic {

    int mathOperation(int a, int b);
    // mathOperation called abstract method
}

interface DoubleOperation {

    double mathOperation(double a , double b);

    
}

public class LambdaBasic {
    
    // This is about Lambda function

    public static void main(String[] args) {
        
        // 1. Addition
        InnerLambdaBasic addition = (a, b) -> a + b;
        DoubleOperation additionDouble = (a, b) -> a + b;


        // 2. Subtraction
        InnerLambdaBasic subtraction = (a, b) -> a - b;
        DoubleOperation subtractionDouble = (a, b) -> a - b;

        // 3. Multiplication

        InnerLambdaBasic multiplication = (a, b) -> a * b;
        DoubleOperation multiplicationDouble = ( a, b) -> a * b;
        // 4. Divide

        InnerLambdaBasic divide = ( a , b ) -> a / b;
        DoubleOperation divideDouble = (a, b) -> a / b;


        // Now we use it
            

        int add = addition.mathOperation(2, 4);
        double addDouble = additionDouble.mathOperation(2, 9.9);
        System.out.println(add);
        System.out.println(addDouble);
        
    }

}
