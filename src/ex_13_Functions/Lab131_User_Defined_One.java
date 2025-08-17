package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void  main(String args[])
    {
        int r1 =sum_of_two_num(4,5);
        int r2 = sum_of_two_num(12,45);
        System.out.println("R1-> "+r1);
        System.out.println("R2-> "+r2);
    }

    static int sum_of_two_num(int first, int second)
    {
        return first+second;
    }
}
