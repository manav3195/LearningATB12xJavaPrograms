package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String args[])
    {
        int item = 006;
        switch(item)
        {
            case 001,006,007:
                System.out.println("Electronics");
                break;
            case 002,003,004:
                System.out.println("Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
