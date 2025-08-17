package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void  main(String args[])
    {
        wp_wr_func(); // without parameter without return type
        String msg = greet_with_hello_wp_with_rt(); // without parameter with return type
        System.out.println(msg);

         sum_of_two_num(6,5); // with parameter without return type
        String value = greet_method("Pramod",30,100); // with parameter with return type
        System.out.println(value);
    }

    static void wp_wr_func()
    {
        System.out.println("Without parameter without return type called");
    }
    static String greet_with_hello_wp_with_rt()
    {
        System.out.println("Without parameter with return type called");
        return "pramod";
    }
    static void sum_of_two_num(int a, int b)
    {
        int result = a+b;
        System.out.println("Sum is " + result);
    }
    static String greet_method(String name, int age, int salary)
    {
        System.out.println("Your name is " +name + "\nYour age is "+ age +"\n Your salary is " +salary);
        return "with_parameter_with_return_type_called";
    }

}
