package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String args[])
    {
        System.out.println("Pass guessing game");
        int attempts=0;
        Random random = new Random();
        int number_to_guess = random.nextInt(100)+1;
        System.out.println(number_to_guess);
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
           /* if(!scanner.hasNextInt())
            {
                System.out.println("Please enter the integer");
                scanner.next();
                continue;
            }
            */
            int guess = scanner.nextInt();
            attempts++;
            if(guess<1 || guess>100)
            {
                System.out.println("Please enter the number between 1 to 100");
                continue;
            }
            if (guess< number_to_guess)
            {
                System.out.println("Number is less");
            }
            else if(guess> number_to_guess)
            {
                System.out.println("Number is High");
            }
            else
            {
                System.out.println("Correct number entered in attempts ->" +attempts);
                break;
            }
        }

    }
}
