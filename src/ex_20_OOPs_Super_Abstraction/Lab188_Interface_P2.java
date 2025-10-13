package ex_20_OOPs_Super_Abstraction;

public class Lab188_Interface_P2 {

}

class P implements I1,I2{

    public void icm1()
    {
        System.out.println("ICM1");
    }

    @Override
    public void icm2() {
        System.out.println("ICM2");
    }

    @Override
    public void icm3() {
        System.out.println("ICM3");
    }
}

interface I1{
    void icm1();
    void icm2();
}

interface I2{

    void icm3();
}