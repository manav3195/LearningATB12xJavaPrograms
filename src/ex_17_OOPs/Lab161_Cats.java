package ex_17_OOPs;

public class Lab161_Cats {
    public static void  main(String args[])
    {
        Cat c1 = new Cat();
        Cat c2 = null;
        new Cat();
        c1.running();
       // c2.running(); it will give Null pointer exception
    }
}

class Cat{
    String name;

    void running()
    {
        System.out.println("Running");
    }

}