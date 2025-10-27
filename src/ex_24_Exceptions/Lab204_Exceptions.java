package ex_24_Exceptions;

public class Lab204_Exceptions {
    public static void main(String args[])
    {
        System.out.println("Starting the program");
        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        int b = Integer.parseInt(ip); // java.lang.NumberFormatException
        int c = 100/b; // java.lang.ArithmeticException: / by zero

        System.out.println(c);
        System.out.println("End the program");
    }
}
