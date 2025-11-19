package ex_26_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_Map_P1 {
    public static void main(String args[])
    {
        //Map is key value
        //You can also add keys of other data type
        Map m1 = new HashMap();
        m1.put("name","Pramod");
        m1.put("rollno",1);
        m1.put("phone",987654321);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name","Pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);

        Map m3 = new TreeMap();
        m3.put("name","Pramod");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);

    }
}
