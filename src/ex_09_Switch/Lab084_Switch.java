package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt())
        {
            int day = scanner.nextInt();
            switch(day)
            {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thu");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter only from 1 to 7");
            }
        }
        else
        {
            System.out.println("Enter only integers");
        }
    }
}
