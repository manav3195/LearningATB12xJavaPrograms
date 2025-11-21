package ex_26_Collection_Framework.MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lab249_HashTable {
    public static void main(String args[])
    {
        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
        // ht1.put(3,null);  Nullpointer exception
        //ht1.put(null,"three"); Nullpointer exception
        System.out.println(ht1);

        HashMap<Integer,String> ht2 = new HashMap<>();
        ht2.put(1,"one");
        ht2.put(2,"two");
        ht2.put(3,"three");
        ht2.put(4,null);
        ht2.put(null,"five");
        System.out.println(ht2);

        Enumeration<Integer> e = ht1.keys();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
