package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter 1st number");
        int b = readInt(scanner, "Enter 2nd number");

        int res_sum = sum(a, b);
        int res_sub = sub(a, b);
        int res_mul = mul(a, b);
        int res_div = div(a, b);
        int res_mod = mod(a, b);

        System.out.println("Sum is " + res_sum);
        System.out.println("Subtraction is " + res_sub);
        System.out.println("Multiplication result is " + res_mul);
        System.out.println("Division result is " + res_div);
        System.out.println("Mod is " + res_mod);
    }


        static int readInt(Scanner scanner, String prompt)
        {
            System.out.println(prompt);
            if(scanner.hasNextInt())
            {
                return scanner.nextInt();
            }
            else
            {
                System.out.println("Please enter only integer");
              System.exit(0);
              return -1;
            }
        }


        static int sum(int a, int b)
        {
            return a+b;
        }
        static int sub(int a, int b)
        {
            return a-b;
        }
        static int mul(int a , int b)
        {
            return a*b;
        }
        static int div(int a, int b) throws ArithmeticException
        {
            if(b==0)
            {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            else
            {
                return a/b;
            }
        }

        static int mod(int a, int b)
        {
            return a%b;
        }

    }

