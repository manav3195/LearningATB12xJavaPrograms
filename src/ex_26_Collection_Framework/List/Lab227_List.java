package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List {
    public static void main(String args[])
    {
        List fruits = List.of("orange","apple","banana","gauva","mango");
        System.out.println(fruits);

        List array_list = new ArrayList<>();
        array_list.add("pramod");
        array_list.add(null);
        array_list.add("dutta");
        array_list.add("dutta"); //duplicate is allowed
        array_list.add(123); //different data is allowed
        System.out.println(array_list);
        System.out.println(array_list.size());
    }
}
