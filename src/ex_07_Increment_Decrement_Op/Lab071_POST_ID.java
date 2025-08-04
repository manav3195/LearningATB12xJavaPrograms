package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String args[])
    {
        int a_post=10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println("b->" +b);

        int c =10;
        System.out.println(c++);
        System.out.println(c);
    }
}
