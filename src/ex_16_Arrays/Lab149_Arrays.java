package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String args[])
    {
        int a=10;
        int [] marks = {91,90,51,100,92,95,97,96};
        boolean[] is_married_couple = {true,true,false};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        //System.out.println(marks[-1]); it will give array index out of bound exception
        //System.out.println(marks[10]); it will give array index out of bound exception

        String name= "Pramod";
        String [] c = name.split("");

    }
}
