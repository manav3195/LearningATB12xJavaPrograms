package ex_16_Arrays;

public class Lab151_Arrays_Part2 {
    public static void main(String args[])
    {
        String [] names = {"Pramod","amit","lucky"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String [] name_atb12x = new String[3];
        name_atb12x[0] ="John";
        name_atb12x[1] ="Brian";
        name_atb12x[2] = "Ram";
        System.out.println(name_atb12x.length);
        System.out.println(name_atb12x[0]);
        System.out.println(name_atb12x[1]);
        System.out.println(name_atb12x[2]);

        boolean[] c = new boolean[2];
        c[0] =true;
        c[1] =false;

    }
}
