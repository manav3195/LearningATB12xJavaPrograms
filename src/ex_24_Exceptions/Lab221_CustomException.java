package ex_24_Exceptions;

public class Lab221_CustomException {
    public static void main(String args[])
    {
        Bank sbi = new Bank("INR",123);
        Bank icici = new Bank("INR",100);
        Integer total_bal = sbi.add(icici);
        System.out.println(total_bal);
        Bank jp_chase = new Bank("USD",101);
        Integer total_bal_all_countries = sbi.add(jp_chase);
        System.out.println(total_bal_all_countries);
    }
}
