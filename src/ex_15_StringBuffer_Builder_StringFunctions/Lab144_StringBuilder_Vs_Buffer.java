package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String args[])
    {
        String s0 = "Pramod";
        String s1 = new String("Pramod");

        StringBuffer sb = new StringBuffer("Pramod");
        StringBuilder sd = new StringBuilder("Pramod");
        System.out.println(sb);
        System.out.println(sd);
        System.out.println(sb.reverse());
        System.out.println(sd.reverse());
    }
}
