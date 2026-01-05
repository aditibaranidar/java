public class TernaryOperator
{
    public static void main(String a[])
    {
       int n = 4;
       int result;
       
       //if(n % 2 == 0)
            //result = 10;
       //else
            //result = 20;
        
        result = n%2 ==0 ? 10 : 20; // Ternary Operator
        // if true assigns first value
        // if false assigns second value
        System.out.println(result);
    
          
    }
}