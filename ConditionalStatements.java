public class ConditionalStatements
{
    public static void main(String[] args)
    {
        int x = 8;
        int y = 7;

        if(x>10 && x<=20) // Range: 11 - 20
            System.out.println("Hello");// Not dependent on indentation
        else
            System.out.println("Bye");

        if(x>y)
        {// Notice extra curly brackets her as a block
            System.out.println(x);
            System.out.println("Thank You");
        }
        else
            System.out.println(y);

    }
}