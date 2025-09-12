package ex_18_OOPs_Constructors;

public class Lab163_OOps_Con {
    public static void main(String args[])
    {
        A a1 = new A();
    }

}

class A{

    A()
    {
        System.out.println("I want to read CSV file");
        System.out.println("Open the page");
        System.out.println("you can do whatever you want to when object is created");
    }
}