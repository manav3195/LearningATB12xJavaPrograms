package ex_21_Static;

public class Lab194_Static_SIB {
    public static void main(String args[])
    {
        A a = new A();
    }


}

class A {

    static
    {
        System.out.println("Called only once when class is laoded");
        System.out.println("You can write the code reading excel file,database file");
    }

    static int c = 10;

    static void m1()
    {
        System.out.println("Static functions");
    }
}