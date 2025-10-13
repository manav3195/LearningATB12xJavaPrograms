package ex_20_OOPs_Super_Abstraction;

public class Lab191 {
    public static void main(String args[])
    {
        pramod d = new Dutta();
        Dutta d1 = new Dutta();
        d.display();
        System.out.println(d.a);
    }

}

class Dutta implements pramod {

    @Override
    public void display()
    {
        System.out.println(a);
    }
}

interface pramod {

    int a = 10;

    void display();
}