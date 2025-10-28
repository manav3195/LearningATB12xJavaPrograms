package ex_24_Exceptions;

public class Lab222_ThrowExample {
    public static void main(String args[])
    {
        validate_age_for_club(11);
    }

    static void validate_age_for_club(int age)
    {
        if(age<18)
        {
            try{
                throw new Exception("Age can't be less than 18");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Enjoy clubbing");
        }
    }
}
