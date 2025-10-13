package ex_20_OOPs_Super_Abstraction;

public class Lab187_Interface_P1 {
    public static void main(String args[])
    {
        car c1= new car();
        c1.drive();
    }


}

class car implements Engine1,brake{

    void drive()
    {
        start_engine();
        test_engine();
        stop_engine();
        apply_brake();
    }

    @Override
     public void test_engine() {
        System.out.println("Override by class car method");
    }



    @Override
    public void start_engine()
    {
        System.out.println("Starting the engine");
    }

    @Override
    public void stop_engine()
    {
        System.out.println("Stopping the engine");
    }

    public void apply_brake()
    {
        System.out.println("Applying brake");
    }
}

interface Engine1{
    void start_engine();
    void stop_engine();

    default void test_engine()
    {
        System.out.println("testing the engine");
    }
}

interface brake{
    void apply_brake();
}