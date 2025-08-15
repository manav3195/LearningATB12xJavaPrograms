package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String args[])
    {
        int factorial =1;
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt())
        {
            System.out.println("Enter the int, rerun the program");
        }
        int num = scanner.nextInt();
        if(num == 0)
        {
            System.out.println("Factorial is ->" +factorial);
        }
        int i=1;
        while(i<=num)
        {
            factorial = factorial*i;
            i++;
        }
        System.out.println("Factorial is " +factorial);
    }
}
