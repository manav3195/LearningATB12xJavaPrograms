package ex_26_Collection_Framework.List;

import com.sun.security.jgss.GSSUtil;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.push("Amit2");

        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("chetan");
        s.add("chetan");
        s.push("vijay");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
