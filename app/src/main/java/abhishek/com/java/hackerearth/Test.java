package abhishek.com.java.hackerearth;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created by abhishek on 7/12/16.
 */

public class Test {


    public static void main(String[] args) {

        Stack<Integer> minStack = new Stack<>();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.offer(1);
        queue.offer(-1);
        queue.offer(3);

        minStack.push(1);
        minStack.push(0);
        minStack.push(3);

        System.out.println(minStack.pop());
        System.out.println(minStack.peek());

        System.out.println(queue.poll());
        System.out.println(queue.peek());

        String str = "";
       ;
        System.out.println( str.contains("u"));


    }
}
