package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab231_ArrayList_95 {
    public static void main(String args[])
    {
        List list = new ArrayList();
        list.add("bread");
        list.add("butter");
        list.add("milk");
        list.add("paneer");
        list.add("jam");
        list.add("cheese");
        list.add(123);
        list.add(true);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("1"));

        System.out.println("-----");
        for(Object o: list)
        {
            System.out.println(o);
        }
        System.out.println("Using iterator");
        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
