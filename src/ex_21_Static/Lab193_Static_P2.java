package ex_21_Static;

public class Lab193_Static_P2 {
    public static void main(String args[])
    {
        ATB umesh = new ATB(1234567890, "Umesh");
        ATB anubha = new ATB(974562318, "Anubha");
        System.out.println(umesh.phone_no);
        System.out.println(anubha.name);
        System.out.println(ATB.course_name);
        ATB.markAttendance();
        umesh.display();
    }
}


class ATB{
    int phone_no;
    String name;
    static String course_name="ATB";

    public ATB(int phone_no,String name)
    {
        this.phone_no=phone_no;
        this.name=name;

    }

    void display()
    {
        System.out.println(this.phone_no + this.name + course_name);
    }

    static void markAttendance()
    {
        System.out.println("Mark Attendance");
    }


}