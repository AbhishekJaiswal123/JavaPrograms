package abhishek.com.java.practice;

import java.util.Arrays;

/**
 * Created by abhishek on 6/8/16.
 */
public class InsertionSort {


    public static void main(String[] args) {

        int[] unsortedNumbers = {6,3,2,1,6,4,8,9,5};
       // insertSort(unsortedNumbers);
        InsertionSort sort = new InsertionSort();
        sort.quickSort(unsortedNumbers,0,unsortedNumbers.length-1);
        System.out.println("Array=    " + Arrays.toString(unsortedNumbers));

    }


    private static void insertSort(int[] pNumbers){

        int length = pNumbers.length;

        for(int i = 1 ; i < length ; i++){

            int key = pNumbers[i];
            int j = i -1;

            while (j>=0 && pNumbers[j] > key ){
                pNumbers[j+1] = pNumbers[j];
                j--;
            }
            pNumbers[j+1] = key;
        }
        System.out.println("pNumbers = " + Arrays.toString(pNumbers));
    }



    private void quickSort(int[] numbers , int p , int r){
        int pivot = numbers[p];

        int i = p;
        int j = r;

        while(i<=j){

            while(i < r && numbers[i] < pivot){
                i++;
            }
            while(j > p && numbers[j] > pivot){
                j--;
            }
            if(i <= j){
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j]  = temp;
                i++;
                j--;
            }

            if(p < j)
                quickSort(numbers,p,j);
            if(r > i)
                quickSort(numbers,i,r);
        }
    }

}
