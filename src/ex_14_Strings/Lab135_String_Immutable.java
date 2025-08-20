package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String args[])
    {
        String name="pramod";
                name.toUpperCase();
        System.out.println(name); // it will still print "pramod" as string is immutable
    }
}
