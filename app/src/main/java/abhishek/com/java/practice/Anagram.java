package abhishek.com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by abhishek on 21/7/16.
 */
public class Anagram {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String TEXT1 = in.nextLine();
        String TEXT2 = in.nextLine();

        if(TEXT1.length() == TEXT2.length()){
            char[] text1ch = TEXT1.toLowerCase().toCharArray();
            char[] text2ch = TEXT2.toLowerCase().toCharArray();

            Arrays.sort(text1ch);
            Arrays.sort(text2ch);

            if(Arrays.equals(text1ch,text2ch)){
                System.out.println(" Two Strings are anagram ");
            }else{
                System.out.println(" Two Strings are  not anagram ");
            }
        }

    }


    private void quickSort(int[] a,int low,int high){

        int pivot = a[low];
        int i = low;
        int j = high;

        while(i <= j){

           while (i < high && a[i] < pivot)
               i++;

            while(j > low && a[j] > pivot)
                j++;

            if(i <= j ){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j++;
            }

            if(i < high){
                quickSort(a,i,high);
            }
            if(j > low)
                quickSort(a,low,j);


        }

    }
}
