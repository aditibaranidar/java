class ArithmeticOperators {
    public static void main(String[] args) 
    {
        int num1 = 7;
        int num2 = 5;

        int result= num1 + num2;
        System.out.println(result); // Addition

        int result1= num1 / num2;
        System.out.println(result1); // Division

        int result2= num1 % num2;
        System.out.println(result2); // Modulus

        num1 = num1 + 2;
        System.out.println(num1); // Increment by 2
        // Shortcut: num1 += 2; and same can be done for other operators

        num1++;
        num1--;
        System.out.println(num1); // Increment and Decrement by 1

        int result3= num1++; // Post increment, fetches the value before increment
        //int result3= ++num1; Pre increment, fetches the value after increment
        System.out.println(result3); 



    }
}