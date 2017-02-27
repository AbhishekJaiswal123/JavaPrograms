package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 14/11/16.
 */

public class MergeSortSolution {

    private static int[] ar;
    private static int[] helper;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0 ; i < T ; i++){

            int N = scan.nextInt();
            ar = new int[N];
            helper = new int[N];
            for(int j = 0 ; j < N ;j++){
                ar[j] = scan.nextInt();
            }
            int low = 0;
            int high = ar.length -1;
            mergesort(low,high);


            for(int j = 0 ; j < N ;j++){
                System.out.print(ar[j]+" ");
            }

        }
    }

    private static void mergesort(int low ,int high){

        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = (low + high) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }


    private static void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = ar[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                ar[k++] = helper[i++];
            } else {
                ar[k++] = helper[j++];
            }
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            ar[k++] = helper[i++];

        }
        while (j <= high) {
            ar[k++] = helper[j++];

        }

    }
}
