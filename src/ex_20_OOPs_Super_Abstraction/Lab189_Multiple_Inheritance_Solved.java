package ex_20_OOPs_Super_Abstraction;

public class Lab189_Multiple_Inheritance_Solved {
    public static void  main(String args[])
    {
        child1 c1 = new child1();
        c1.money();
        c1.df();
    }

}


class child1 implements Father1,Mother1{

    @Override
    public void money() {
        System.out.println("Money from child");
    }

    @Override
    public void f1() {
        System.out.println("F1");

    }

    @Override
    public void m1() {
        System.out.println("M1");
    }

    @Override
    public void df() {
        Father1.super.df();
        Mother1.super.df();
    }
}

interface Father1{

    void money();
    void f1();

    default void df()
    {
        System.out.println("Father default method");
    }
}

interface Mother1{

    void money();
    void m1();

    default void df()
    {
        System.out.println("Mother default method");
    }
}