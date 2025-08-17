package ex_12_DoWhile;

public class Lab126_Diff_While_DowhILE {
    public static void main(String args[])
    {
        int a=0;
        while(a<0)
        {
            System.out.println("Executing while loop");
        }
        do
        {
            System.out.println("Do while loop-> " +a);
            a++;
        }while(a<0);
    }
}
