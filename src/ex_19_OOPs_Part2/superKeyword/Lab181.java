package ex_19_OOPs_Part2.superKeyword;

public class Lab181 {
    public static void main(String args[])
    {
        son s = new son();
        s.newHome();
    }

}

class father{

    father()
    {
        System.out.println("DC-Father");
    }
    int gold=10;

    void home()
    {
        System.out.println("Home-Father");
    }
}

class son extends father{

    son()
    {
        super();
    }
    void bike()
    {
        System.out.println("Son-Bike");
    }

    void newHome()
    {
        super.home();
        System.out.println(super.gold);
        this.bike();
    }
}