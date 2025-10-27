package ex_23_Wrapper_Class;

public class Lab203_Wrapper_Conversion {
    public static void main(String args[])
    {
        String num="10";
        Integer aa=10;

        //String to wrapper conversion
        Integer a = Integer.parseInt(num);
        System.out.println(a);

        //String to primitive data type
        int a_p = Integer.parseInt(num); // converting string to integer
        System.out.println(a_p);

        Integer aa3 = Integer.valueOf("10"); // converting string to integer
        System.out.println(aa3);

        String name = aa.toString();
        System.out.println(name);
        System.out.println(name instanceof String);


    }
}
