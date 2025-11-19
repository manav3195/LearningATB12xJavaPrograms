package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab232_Nested_ArrayList {
    public static void main(String args[])
    {
        List<String> fruits1 = new ArrayList();
        fruits1.add("strawberry");
        fruits1.add("Gauva");
        fruits1.add("apple");

        List fruits2 = new ArrayList();
        fruits2.add("banana");
        fruits2.add("mango");
        fruits2.add("litchi");

        List vegetables = new ArrayList();
        vegetables.add("tomato");
        vegetables.add("potato");
        vegetables.add("onion");

        List all_fruits_vegetables = new ArrayList();
        all_fruits_vegetables.add(fruits1);
        all_fruits_vegetables.add(fruits2);
        all_fruits_vegetables.add(vegetables);

        System.out.println(all_fruits_vegetables);
        System.out.println(all_fruits_vegetables.size());
        System.out.println(all_fruits_vegetables.get(1));

    }
}
