package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String args[])
    {
        int age = 21;
        String result = (age>18) ? (age>25 ? "In Goa you can drink" : "You can't drink")  :"You can't go to Goa";
        System.out.println(result);
    }
}
