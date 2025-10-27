package ex_24_Exceptions;

public class Lab214 {
    public static void main(String args[])
    {
        try{
            String ip = args[0]; // ArrayIndexOutofBoundException
            int a = Integer.parseInt(ip); //NumberFormatException
            int c = 10/a ; //ArithmeticException
            System.out.println(c);
        }
        catch(NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be always called");
        }
    }
}
