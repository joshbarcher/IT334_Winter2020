package test;

import queues.IPriorityQueue;
import queues.PriorityQueue;

public class InformalQueueTest
{
    public static void main(String[] args)
    {
        //always program against an interface!
        IPriorityQueue<Integer> numberHeap = new PriorityQueue<>();

        //add a few numbers...
        numberHeap.insert(5);
        numberHeap.insert(3);
        numberHeap.insert(2);
        numberHeap.insert(7);
        numberHeap.insert(10);

        System.out.println(numberHeap);
        System.out.println("Num elements in heap: " + numberHeap.size());
    }
}
