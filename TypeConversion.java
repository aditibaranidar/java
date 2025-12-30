class TypeConversion
{
    public static void main(String args[]) // use args instead of a[] bc of use of 'a' below
    {
        byte b = 125;
        int a = b; // Implicit conversion from byte to int
        byte k = (byte)a; // Explicit cast from int to byte

        float f = 5.6f;
        int t = (int) f; // Explicit cast from float to int

        System.out.println(a);
        System.out.println(t);

    }
}