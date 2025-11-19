package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237_AL_iteration {
    public static void main(String args[])
    {
        List<String> mylist = new ArrayList<>();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");
        System.out.println("To print ---1");

        for(String s :mylist)
        {
            System.out.println(s);
        }
        System.out.println("To print ----2");
        Iterator<String> iterator = mylist.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("To print ---3");
        for(int i=0; i<mylist.size(); i++)
        {
            System.out.println(mylist.get(i));
        }

    }
}
