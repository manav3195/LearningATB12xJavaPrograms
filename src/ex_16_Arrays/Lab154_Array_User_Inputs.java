package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void  main(String args[])
    {
        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[] names = new String[size];
        for(int i=0; i<names.length; i++)
        {
            System.out.println("Element at position " + i);
            names[i] = scanner.next();
        }
        System.out.println("Printing the array");
        for(String b : names)
        {
            System.out.println(b);
        }
    }
}
