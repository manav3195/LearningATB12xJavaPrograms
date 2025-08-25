package ex_14_Strings;

public class LabStringExample3 {
    public static void  main(String args[])
    {
        String s1 = "Java".substring(2); // it will print va
        System.out.println(s1);
        String s2 = "Java".substring(1,3); // it will print from index 1 to index 2
        System.out.println(s2);

        char[] arr = "Java".toCharArray();
        for(char c : arr)
        {
            System.out.println(c);
        }
    }
}
