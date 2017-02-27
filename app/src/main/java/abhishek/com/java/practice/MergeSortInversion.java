package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 14/11/16.
 */

public class MergeSortInversion {

    private static int[] a;
    private static int[] t;

    static long  count =0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int i = 0 ; i < T ; i++){
            count = 0;
            int N = scan.nextInt();
            a = new int[N];
            t = new int[N];
            for(int j = 0 ; j < N ;j++){
                a[j] = scan.nextInt();
            }
            int low = 0;
            int high = a.length -1;
            mergeSort(low,high);

            System.out.println(count);
        }
    }


    static  void merge(int start,int mid,int end){
        int i = start, j = mid + 1, k = 0;
        while(i <= mid && j <= end){
            if(a[i] <= a[j])
                t[k++] = a[i++];
            else{
                count += mid-i+1;
                t[k++] = a[j++];
            }
        }
        while(i <= mid)
            t[k++] = a[i++];
        while(j <= end)
            t[k++] = a[j++];
        k = 0;
        for(i = start;i <= end;i++)
            a[i] = t[k++];



    }
    static void mergeSort(int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort(start,mid);
            mergeSort(mid+1,end);
            merge(start,mid,end);
        }
    }
}
