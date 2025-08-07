package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {

    public static void main(String args[])
    {
        System.out.println("Enter the browser");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch(browser)
        {
            case "chrome":
                System.out.println("Starting chrome");
                break;
            case "firefox":
                System.out.println("Starting firefox");
                break;
            case "edge":
                System.out.println("Starting Edge");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
