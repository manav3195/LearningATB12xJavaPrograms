package ex_24_Exceptions;

import java.net.Inet4Address;

public class Lab215_JR_QA {
    public static void main(String args[]) {
        String ip = null;
        try {
            ip = args[0];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        int a =0;
        try{
           a = Integer.parseInt(ip);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        int b=0;
        try{
             b=10/a;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
