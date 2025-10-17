package ex_21_Static;

public class Lab195_Real {
    public static void main(String args[])
    {

    }

}

class ATB1 {

    {
        System.out.println("This is called when object is created");
    }

    static
    {
        System.out.println("Load the class, I will get execute");
    }

    private String name;
    private String phone_no;
    static String course_name = "ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    void readDocuments()
    {
        System.out.println("Non static method");
        System.out.println(course_name);
    }

    static void doAssignments()
    {
        // System.out.println(phone_no); static methods can't access non static variables
        System.out.println("Do Assignment");
    }
}