package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    public static void main(String args[])
    {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in); // taking input from scanner class
        int age = scanner.nextInt();
        if(age>18)
        {
            System.out.println("Allowed to vote");
        }
        else
        {
            System.out.println("Not allowed to vote");
        }
    }
}
