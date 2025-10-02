package QueueInterface;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        q.offer(2);
        q.offer(1);
        q.offer(5);
        q.offer(4);
        q.offer(0);
        
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        // System.out.println(q);
        // System.out.println(q.poll()); //remove element
        // System.out.println(q.peek()); //pick the top element

        // System.out.println(q);
        System.out.println("-----------------------------");
        System.out.println("Array Deque");
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offer(2);
        dq.offer(4);
        dq.offer(1);
        dq.offer(0);
        
        while(!dq.isEmpty()){
            System.out.println(dq.pollLast());//dq.poll(), dq.pollFirst()
        }

System.out.println("------------------------------------");
        System.out.println("Stacks");
        Stack<Integer> st=new Stack<Integer>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
       
        while(!st.empty()){
            System.out.println(st.pop());
        }
        System.out.println("-------------------------------");
        System.out.println("ArrayDeque for Stack");
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(9);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        }
}
