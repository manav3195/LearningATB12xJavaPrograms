package ex_23_Wrapper_Class;

public class Lab204_Wrapper {
    public static void main(String args[])
    {
        int a=10;
        Integer b=a; //Autoboxing
        System.out.println(b);
        System.out.println(b.intValue());

        Integer aa=43;
        int a1=aa; //Unboxing
        System.out.println(a1);
        System.out.println();

        Integer myint=50;
        String name = myint.toString();
        int i= myint.intValue();
        int i2=myint;
    }
}
