package ex_16_Arrays;

public class Lab152_Arrays_Print {
    public static void  main(String args[])
    {
        int[] marks ={51,92,95,86,82};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("Using for loop");

        for(int i =0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("Using enhanced loop");
        for(int c : marks)
        {
            System.out.println(c);
        }
    }
}
