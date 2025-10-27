package ex_24_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab206_Checked {
    public static void main(String args[])
    {
        int a=0;
        try{
            a=10/0;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.

        try {
            FileInputStream f = new FileInputStream("C://log.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
