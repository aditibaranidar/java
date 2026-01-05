public class LogicalOperators 
{
    public static void main(String [] args)
    {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = (x > y) && (a < b); // Logical AND operator
        System.out.println(result);

        boolean result1 = (x > y) || (a > b); // Logical OR operator
        System.out.println(result1); 

        boolean result2 = !(a > b); // Logical NOT operator
        System.out.println(!result2);
    }
}