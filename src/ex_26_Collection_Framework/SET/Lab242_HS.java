package ex_26_Collection_Framework.SET;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab242_HS {
    public static void main(String args[])
    {
        Set<Integer> ts = new TreeSet<>();
        ts.add(9);
        ts.add(3);
        ts.add(1);
        System.out.println(ts);
        Iterator<Integer> iterator = ts.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
