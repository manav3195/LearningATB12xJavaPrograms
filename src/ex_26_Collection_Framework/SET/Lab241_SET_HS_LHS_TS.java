package ex_26_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab241_SET_HS_LHS_TS {
    public static void main(String args[])
    {
        Set<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);
        System.out.println("------------");

        Set<String> ls = new LinkedHashSet();
        ls.add("Dapple");
        ls.add("Apple");
        ls.add("Banana");
        ls.add("Watermelon");
        ls.add("Watermelon");
        ls.add(null);
        System.out.println(ls);
        System.out.println(ls.isEmpty());
        System.out.println(ls.size());
        System.out.println(ls.contains("apple"));
        System.out.println("----------------");

        Set<String> ts = new TreeSet();
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Watermelon");
        ts.add("Watermelon");
        //ts.add(null); in case of tree set, null is not allowed
        System.out.println(ts);

    }
}
