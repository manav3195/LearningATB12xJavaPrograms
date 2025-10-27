package ex_24_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab220_Interview {
    public static void main(String args[])
    {
        try{
            FileInputStream f = new FileInputStream("C://log.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("yes");
        }
    }
}
