package ex_16_Arrays;

public class Lab156_SUM_OF_ARRAYS {
    public static void main(String args[])
    {
        int [] numbers ={10,14,30};
        int sum=0;
        for(int i=0; i<=numbers.length-1; i++)
        {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of the array is " +sum);
    }
}
