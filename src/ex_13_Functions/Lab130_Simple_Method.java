package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String args[])
    {
        non_return_type_func();
        String a = return_type_func();
        System.out.println(a);
    }
    static void non_return_type_func()
    {
        System.out.println("Non Return type function called");
    }

    static String return_type_func()
    {
        System.out.println("Return type function called");
        return "pramod";
    }
}
