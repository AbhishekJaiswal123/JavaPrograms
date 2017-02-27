package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 14/11/16.
 */

public class InsertionsortAdvancedAnalysis {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0 ; i < T ; i++){

            int N = scan.nextInt();
            int[] ar = new int[N];
            for(int j = 0 ; j < N ;j++){
                ar[j] = scan.nextInt();
            }
            System.out.println(shiftCount(ar));

        }
    }

    private static int shiftCount(int[] ar){
        int count = 0;
        for(int i = 1 ; i < ar.length ; i++){
            int j = i -1;
            int key = ar[i];
            int shift = 0;

            while(j >= 0 && ar[j] > key){
                shift++;
                ar[j+1] = ar[j];
                j--;
            }
            count = count + shift;
            ar[j+1] = key;
        }
        return count;
    }
}
