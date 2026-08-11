interface lambdaBasic{
	public int addition(int a, int b);
    }
    
class cal implements lambdaBasic{
	public int addition(int a, int b){
    int c = a + b;
   	return c;
    
    }
    
}


class Debug_Lambda{
	public static void main(String[] args){
    
    cal plus = new cal();
    
    System.out.println(plus.addition(20, 90));
    }
}
