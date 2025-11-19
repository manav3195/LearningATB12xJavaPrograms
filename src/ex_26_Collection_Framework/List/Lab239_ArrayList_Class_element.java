package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab239_ArrayList_Class_element {
    public static void main(String args[])
    {
        Student s1 = new Student("Amit","1");
        Student s2 = new Student("Pramod","2");
        Student s3 = new Student("shubham","3");

        List<Student> mylist = new ArrayList<>();
        mylist.add(s1);
        mylist.add(s2);
        mylist.add(s3);

        System.out.println(mylist);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
