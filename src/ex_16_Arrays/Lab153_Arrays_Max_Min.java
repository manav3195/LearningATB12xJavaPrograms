package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String args[]) {
        int[] num = {40, 45, 52, 17, 29, 92, 34};
        int max = num[0];
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] > max)
            {
                max = num[i];
            }
        }
        System.out.println("Maximum number is " + max);

        System.out.println("Minimum value code");
        int min = num[0];
        for(int i =0; i<num.length; i++)
        {
            if(num[i] < min)
            {
                min = num[i];
            }
        }
        System.out.println("Minimum value is " + min);
    }
}
