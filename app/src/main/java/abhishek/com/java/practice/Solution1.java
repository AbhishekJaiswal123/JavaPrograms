package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 25/9/16.
 */

public class Solution1 {

    public int quickSwapCount = 0;
    public int insertSwapCount = 0;


    public void quickSort(int[] ar,int low,int high){

        if(low < high){

            int q = partition(ar,low,high);
            // printArray(ar);
            quickSort(ar, low, q-1);
            quickSort(ar, q+1, high);


        }
    }

    public int partition(int[] ar, int low, int high){

        int pivot = ar[high];
        int i = low ;

        for(int j = low ; j <= high ; j++){

            if(ar[j] <= pivot){

                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                quickSwapCount++;
                i++;
            }
        }
        return i-1;
    }

    public void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public void insertionSort(int[] ar){

        for(int i = 1 ; i < ar.length ; i++){

            int key = ar[i];
            int j = i - 1;

            while(j>=0 && ar[j]>key){
                ar[j+1] = ar[j];
                insertSwapCount++;
                j--;
            }
            ar[j+1] = key;
        }
        System.out.println(insertSwapCount - quickSwapCount);
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named LexicographicalNextString. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        int[] a = new int[n];

        for(int i = 0 ; i < n ; i++){
            ar[i] = scan.nextInt();
            a[i] = scan.nextInt();
        }

        Solution1 sol = new Solution1();

        sol.quickSort(ar,0,ar.length-1);

        sol.insertionSort(a);


    }
}