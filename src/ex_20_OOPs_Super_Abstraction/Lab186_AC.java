package ex_20_OOPs_Super_Abstraction;

public class Lab186_AC {
    public static void  main(String args[])
    {
        WagonR r = new WagonR();
        r.drive();
    }
}

class WagonR extends Engine implements tyre,gear{

    void start_engine()
    {
        System.out.println("Starting the engine");
    }

    void drive()
    {
        rubber();
        blackColorToDo();
        start_engine();
        m1();
        m2();
        stop_engine();


    }
   public void rubber()
    {
        System.out.println("Rubber tyres");
    }

   public void blackColorToDo()
    {
        System.out.println("black color");
    }

   public void change_gear()
    {

    }
}

abstract class Engine{

    abstract void start_engine();

    public void stop_engine()
    {
        System.out.println("Stopping the engine");
    }
}

interface tyre{

    void rubber();
    void blackColorToDo();

    default void m1()
    {
        System.out.println("Default method 1-interface");
    }
    default void m2()
    {
        System.out.println("Default method 2-interface");
    }
    static void m3()
    {

    }
}

interface gear{
    void change_gear();
}