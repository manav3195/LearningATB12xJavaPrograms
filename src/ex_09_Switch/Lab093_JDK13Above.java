package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String args[])
    {
        int item = 001;
        switch(item)
        {
            case 001 -> System.out.println("001"); // only 001 will be printed
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("default");
        }
    }
}
