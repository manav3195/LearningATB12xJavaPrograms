package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "Hello";


        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        // == check for reference location
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s4); // false
        System.out.println(s2 == s4); // false
        System.out.println(s3 == s5); // false
        System.out.println(s1 == s2); //true

        // equals check value
        //equalsIgnoreCase -> check the value and also ignore the case
        System.out.println("Using equals");
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s5));



    }
}
