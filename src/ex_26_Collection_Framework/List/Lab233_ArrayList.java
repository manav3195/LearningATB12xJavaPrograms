package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab233_ArrayList {
    public static void main(String args[])
    {
        List marks = new ArrayList();
        marks.add(95);
        marks.add(85);
        marks.add(56);
        marks.add(89);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println("After sorting");
        System.out.println(marks);
        System.out.println("Reverse order");
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
