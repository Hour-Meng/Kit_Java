
public class FunctionBasic {

    // Static: Value, function|method belong to the created internal Class
    public static void main(String[] args) {
        
        System.out.println(Addition(4,3));
        System.out.println(Addition(1,4,10));
    }   
    
    // This is our function or in the other word method

    private static int Addition(int a, int b){

        int answer = a + b ;

        return answer;
    }
    
    // Special thing about java is that you can overide the function

    private static int Addition(int a, int b, int c){
        int answer = a + b + c;

        return answer;
    }
}
