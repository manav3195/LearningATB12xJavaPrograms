package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab234_Arraylist_input {
    public static void main(String args[])
    {
        Scanner scanner= new Scanner(System.in);
        List list = new ArrayList<>();

        List<String> names = new ArrayList<>();
        String continueInput="Y";
        while(continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter name");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();
            System.out.println("Do you want to enter another name Y/N");
            continueInput = scanner.nextLine();
        }
        for(String n : names)
        {
            System.out.println(n);
        }
        scanner.close();

    }
}
