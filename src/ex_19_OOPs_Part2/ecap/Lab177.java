package ex_19_OOPs_Part2.ecap;

public class Lab177 {
    public static void main(String args[])
    {
        ICICIBank I1 = new ICICIBank("Amit",100);
        System.out.println(I1.getBal());

        boolean isCashier = false;
        I1.setBal(2000,isCashier);
        System.out.println(I1.getBal());
        System.out.println(I1.bank_name);
    }

}

class ICICIBank{

    private String name;
    private long bal;
    public String bank_name ="ICICI";

    public ICICIBank(String name,long bal)
    {
        this.name=name;
        this.bal=bal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        }
        else
        {
            System.out.println("Not allowed to change the balance");
        }
    }

}





