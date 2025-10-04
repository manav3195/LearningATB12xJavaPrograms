package ex_19_OOPs_Part2.poly.methodoverriding;

public class REALExample {
    public static void main(String args[])
    {
        TC_Chrome t = new TC_Chrome();
        t.openbrowser();

       /*CommonToAllTC c = new TC_Chrome();
        c.openbrowser(); */
    }
}


class CommonToAllTC{

    void openbrowser()
    {
        System.out.println("Opening the browser");
    }
}

class TC_Chrome extends CommonToAllTC{

    void openbrowser()
    {
        System.out.println("Starting a chrome");
    }
}