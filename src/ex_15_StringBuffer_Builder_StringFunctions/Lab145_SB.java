package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Pramod");
        sb.append("Dutta");
        System.out.println(sb);

        String s1 = "Pramod";
        s1 = s1 + "Dutta";
        System.out.println(s1);
    }
}
