package ex_15_StringBuffer_Builder_StringFunctions;

public class InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String args[])
    {
        String name= "Pramod";
        String reverse="";
        for(int i = name.length()-1; i>=0; i--)
        {
            reverse= reverse + name.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("Using string buffer");
        StringBuffer sb = new StringBuffer(name);
        System.out.println(sb.reverse());


    }
}
