package ex_26_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab246_Map_Real {
    public static void main(String args[])
    {
        Map<String,Object> student1 = new HashMap<>();
        student1.put("name","Pramod");
        student1.put("phone","9876543210");
        student1.put("address","BLR");
        student1.put("home_address","H8");
        System.out.println(student1);

        Map<String,Object> student2 = new HashMap<>();
        student2.put("name","Lucky");
        student2.put("phone","8765423412");
        student2.put("address","DEL");
        student2.put("home_address","D5");
        System.out.println(student2);

        Set book_name = new HashSet();
        book_name.add("Rich Dad Poor Dad");
        book_name.add("Sapiens");
        book_name.add("Ferrari");
        book_name.add("Atomic Habit");
        book_name.add("Atomic Habit");
        book_name.add("Eat the frog");
    }
}
