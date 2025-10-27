package ex_24_Exceptions;

import java.util.Scanner;

public class Lab213 {
    public static void main(String args[])
    {
        int a=1;
        int c=0;
        Scanner scanner = new Scanner(System.in);
        try{
            int v = scanner.nextInt();
            c=10/v;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println("Closing SC");
        }
    }
}
