package ex_26_Collection_Framework.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lan248_Map_within_ArrayList {
    public static void main(String args[])
    {
        HashMap<String,String> student1 = new HashMap<>();
        student1.put("name","pramod");
        student1.put("roll","1");
        student1.put("phone","9876543210");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap<>();
        student2.put("name","amit");
        student2.put("roll","2");
        student2.put("phone","8567345612");
        System.out.println(student2);

        List list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        System.out.println(list);

    }
}
