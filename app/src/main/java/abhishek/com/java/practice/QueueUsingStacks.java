package abhishek.com.java.practice;

import java.util.Stack;

/**
 * Created by abhishek on 16/1/17.
 */

public class QueueUsingStacks {

    private static Stack<Integer> input = new Stack<>();
    private static Stack<Integer> queue = new Stack<>();

    public static void main(String[] args) {

        add(1);
        add(2);
        System.out.println(poll());
        add(3);
        add(4);


        System.out.println(poll());
        System.out.println(poll());


    }

    private static void add(int data){
        input.add(data);

    }

    private static int poll(){

            if (queue.size() == 0) {
                while (input.size() > 0) {
                    queue.add(input.pop());
                }
            }
        if(queue.size() > 0)
            return queue.pop();
        else
            return 0;


    }
}
