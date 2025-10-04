package ex_19_OOPs_Part2.superKeyword;

public class Lab180 {

}

class Baseclass{

    private String browser;

    public Baseclass(String browser)
    {
        this.browser=browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAdmin) {
        if(isAdmin)
        {
            this.browser = browser;
        }
        else
        {
            System.out.println("Change browser not allowed, Not a Admin");
        }

    }
     void openbrowser()
    {
        System.out.println("Opening browser");
    }
     void openbrowser(String browsername)
    {
        System.out.println("Opening browser ->" +browsername);
    }
    void closebrowser()
    {
        System.out.println("Closing the browser");
    }
    void bhk3()
    {

    }

}

class Testcase1 extends Baseclass{

    public Testcase1(String Browser)
    {
        super(Browser);
        super.openbrowser();
        super.openbrowser("Chrome");
        super.closebrowser();
        super.bhk3();
    }

}