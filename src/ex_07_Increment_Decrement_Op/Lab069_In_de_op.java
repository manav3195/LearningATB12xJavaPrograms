package ex_07_Increment_Decrement_Op;

public class Lab069_In_de_op {
    public static void main (String args[])
    {
        String age = args[0];
        System.out.println(age);
        int user_input = Integer.parseInt(age);
        System.out.println("Int->" + user_input);
        String a1 = args[1];
        float num = Float.parseFloat(a1);
        System.out.println("Float->" + num);
    }
}
