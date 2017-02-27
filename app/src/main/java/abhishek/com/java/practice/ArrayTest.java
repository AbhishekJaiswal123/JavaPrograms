package abhishek.com.java.practice;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by abhishek on 5/11/16.
 */

public class ArrayTest {
    public static void main(String args[]) {
        // create priority queue
        PriorityQueue <Integer>  prq = new PriorityQueue< Integer >();

        Scanner scan = new Scanner(System.in);
        // insert values in the queue
        for ( int i = 0; i  <  10; i++ ){
            prq.offer(scan.nextInt());
        }

        System.out.println ( "Initial priority queue values are: "+ prq);

        prq.poll();
        System.out.println ( "Initial priority queue values are: "+ prq);
        // add using offer() function call
        prq.offer(122);

        System.out.println ( "Priority queue values after addition: "+ prq);
    }
}
