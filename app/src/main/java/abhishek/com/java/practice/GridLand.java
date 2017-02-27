package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 10/11/16.
 */

public class GridLand {
    private static class Segment{
        int min;
        int max;
        Segment(){
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();


        Segment[] segment = new Segment[n+1];

        int count = 0;
        for(int i = 1 ; i <= k ; i++){

            int r = scan.nextInt();
            int c1 = scan.nextInt();
            int c2 = scan.nextInt();

            if(segment[r] != null){
                int min = segment[r].min;
                int max = segment[r].max;

                if(c1 < min){
                    segment[r].min = c1;
                    count = count + (min - c1);
                }

                if(c2 > max){
                    segment[r].max = c2;
                    count = count + (c2 - max);
                }
            }else{
                segment[r] = new Segment();
                segment[r].min = c1;
                segment[r].max = c2;
                count = count + (c2-c1+1);
            }



        }
        scan.close();
        int result = (n * m ) - count;
        System.out.println(result);

    }
}