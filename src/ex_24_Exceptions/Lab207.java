package ex_24_Exceptions;

public class Lab207 {
    public static void main(String args[])
    {
        String name = null;
        try{
            name.trim();
        }
        catch(Exception e)
        {
            e.printStackTrace(); // it will print red error
        }
    }
}
