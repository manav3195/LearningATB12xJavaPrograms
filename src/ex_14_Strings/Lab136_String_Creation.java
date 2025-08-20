package ex_14_Strings;

public class Lab136_String_Creation {
    public static void main(String args[])
    {
        String s1 ="pramod"; // here string is stored in String constant pool

        String s2 = new String("pramod"); // here String is stored in Object area

        System.out.println(s1 == s2); // it will return false as both are in different memory locations
    }
}
