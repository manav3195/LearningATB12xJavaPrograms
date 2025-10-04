package ex_19_OOPs_Part2.accessModifer.police;

public class Cop {

    private int gun;
    String id_card;

    public Cop(int gun)
    {
        this.gun=gun;
    }

    protected void canIshoot() // within package only, it will be accessible
    {
        System.out.println("Yes you are allowed to shoot");
    }

    private void defaultfunction()
    {

    }

}
