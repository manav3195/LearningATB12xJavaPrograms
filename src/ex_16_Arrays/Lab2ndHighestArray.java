package ex_16_Arrays;

public class Lab2ndHighestArray {
    public static void main(String args[])
    {
        int[] numbers = {12,45,67,32,46,89,68};
        int highest = 0;
        int second_highest=0;

        for(int num : numbers)
        {
            if(num>highest)
            {
                second_highest=highest;
                highest=num;
            } else if (num > second_highest && num != highest)
            {
                second_highest=num;
            }
        }
        System.out.println("Highest number is " + highest);
        System.out.println("Second highest number is "+ second_highest);

    }
}
