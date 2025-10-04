package ex_19_OOPs_Part2.ecap;

import org.w3c.dom.ls.LSOutput;

public class Lab176 {
    public static void  main(String args[])
    {
        VWOLogin vwologin = new VWOLogin("admin","pass123");
        System.out.println(vwologin.password);
        vwologin.password = "345";
        System.out.println(vwologin.password);

        GoodVWOLogin goodvwologin = new GoodVWOLogin("admin","pwd123");
        System.out.println(goodvwologin.getUsername());
        System.out.println(goodvwologin.getPassword());

        goodvwologin.setUsername("pramod");
        System.out.println(goodvwologin.getUsername());
        goodvwologin.setPassword("p@123",true);
        System.out.println(goodvwologin.getPassword());
    }


}


class VWOLogin{

    public String username;
    public String password;

   public VWOLogin(String username, String password)
    {
        this.username=username;
        this.password = password;
    }
}

class GoodVWOLogin{
    private String username;
    private String password;


    public GoodVWOLogin(String usr, String pwd)
    {
        this.username=usr;
        this.password=pwd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }
        else{
            System.out.println("Not allowed set the password,Not a Admin");
        }
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}