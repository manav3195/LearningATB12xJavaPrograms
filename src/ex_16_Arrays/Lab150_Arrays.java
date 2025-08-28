package ex_16_Arrays;

public class Lab150_Arrays {
    public static void main(String args[])
    {
        int [] marks = {1,2,3,4,5,6};

        //2nd way to create the array
        int [] marks2 = new int[5];
        int marks3[] = new int[5];
        //here the size is fixed

        String [] names = new String[3];
        names[0] = "Pramod";
        names[1] = "John";
        names[2] = "Brian";

        System.out.println(marks[0]);
        System.out.println(marks2[0]); // it will print 0 as no values are assigned
    }
}
