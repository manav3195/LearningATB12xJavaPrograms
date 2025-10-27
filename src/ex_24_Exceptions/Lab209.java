package ex_24_Exceptions;

public class Lab209 {
    public static void main(String args[])
    {
        int a=0;
        int b=0;
        try {
            int c = 10 / b;
        }
        catch(Throwable e)
        {
            System.out.println(e.getMessage());
        }
        //System.out.println(c);

    }
}
