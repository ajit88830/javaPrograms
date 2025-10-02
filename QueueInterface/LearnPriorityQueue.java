package QueueInterface;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(50);
        pq.add(30);
        pq.add(10);
        pq.add(70);
        pq.add(90);
        System.out.println(pq.poll());
    
    }
}
