package ex_20_OOPs_Super_Abstraction;

public class Lab185_Abstract {
    public static void main(String args[])
    {
        son s1 = new son();
        s1.loan50k();
    }



}

class Normal{
    // complete class
}

abstract class Father{

    abstract void loan50k();
}

class son extends Father{

    void loan50k()
    {
        System.out.println("loan given");
    }
}