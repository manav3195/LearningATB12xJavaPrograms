package ex_24_Exceptions;

public class Lab208 {
    public static void main(String args[])
    {
        int a=0;
        int b=0;
        try {
            int c = 10 / b;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
