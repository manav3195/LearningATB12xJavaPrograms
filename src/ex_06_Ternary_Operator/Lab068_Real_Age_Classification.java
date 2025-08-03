package ex_06_Ternary_Operator;

public class
Lab068_Real_Age_Classification {
    public static void main(String args[])
    {
        System.out.println("Hello");
        String user_input = args[0];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);
        int num = Integer.parseInt(user_input); //to convert string into integer
       // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)

        String result = (num>18) ? ((num>65) ? "Senior" : "Adult") : "Minor";
        System.out.println(result);

    }
}
