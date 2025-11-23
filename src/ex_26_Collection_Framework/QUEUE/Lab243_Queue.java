package ex_26_Collection_Framework.QUEUE;

import java.util.PriorityQueue;

public class Lab243_Queue {
    public static void main(String args[])
    {
        PriorityQueue q = new PriorityQueue();
        q.add("pramod");
        q.add("Dutta");
        System.out.println(q); //natural sorting
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
