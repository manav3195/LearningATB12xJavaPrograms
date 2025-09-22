package ex_19_OOPs_Part2.inheritance.multilevel;

public class Lab170_MultiLevel {

    public static void main(String args[])
    {
        Son pramod = new Son();
        Father f = new Father();
        GrandFather gf = new GrandFather();

        Son s1 = new Son();
        Father f1 = new Son(); //dynamic dispatch
        GrandFather gf1 = new Son();
        GrandFather gf2 = new Father();


    }
}
