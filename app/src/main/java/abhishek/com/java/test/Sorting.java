package abhishek.com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by abhishek on 25/1/17.
 */

public class Sorting {

    public static void main(String[] args) {

        Integer[] list = {4,8,1,3,0,5,9,2,11};
      //  insertionSort(Arrays.asList(list));
      //  quickSort(Arrays.asList(list),0,8);
      //  mergeSort(Arrays.asList(list),0,8);
      //  bubbleSort(Arrays.asList(list));
        heapSort(Arrays.asList(list));

        for (Integer i : list){
            System.out.print(i + " ");
        }


    }


    public static void insertionSort(List<Integer> list){

        for(int i = 1 ; i < list.size() ; i++){

            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key){

                list.set(j+1,list.get(j));
                j--;
            }
            list.set(j+1,key);

        }
    }

    public static void quickSort(List<Integer> list,int low, int high){

        int i = low;
        int j = high;

        if(i <= j){

            int pivot = list.get(high);

            while (i <= high && list.get(i) < pivot){
                i++;
            }
            while (j >= low && list.get(j) > pivot){
                j--;
            }

            if(i <= j){
                int temp = list.get(j);
                list.set(j,list.get(i));
                list.set(i,temp);
                i++;
                j--;
            }

            if(i < high){
                quickSort(list,i,high);
            }
            if(j > low){
                quickSort(list,low,j);
            }
        }
    }

    private static void mergeSort(List<Integer> list,int low,int high){

        if(low < high){

            int mid = (low+high)/2;

            mergeSort(list,low,mid);
            mergeSort(list,mid+1,high);
            merge(list,low,mid,high);
        }
    }

    private static void merge(List<Integer> list,int low,int mid,int high){

        int i = low;
        int j = mid+1;
        int k = low;

        List<Integer> temp = new ArrayList<>();
        for (Integer num :list){
            temp.add(num);
        }

        while (i <= mid && j <= high){

            if(temp.get(i) <= temp.get(j))

                list.set(k++,temp.get(i++));
            else

                list.set(k++,temp.get(j++));

        }

        while (i <= mid){
            list.set(k++,temp.get(i++));
        }
        while (j <= high){
            list.set(k++,temp.get(j++));
        }
    }

    private static void bubbleSort(List<Integer> list){
        for(int i = 0 ; i < list.size() ; i++){
            for (int j = 1 ; j < list.size()-i ; j++){

                if(list.get(j-1) >= list.get(j)){
                    int temp = list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,temp);
                }

            }
        }
    }

    private static void heapSort(List<Integer> list){

        int n = list.size();

        heapify(list,n,0);

        for (int i = n-1 ; i >= 0 ; i--){
            int temp = list.get(0);
            list.set(0,list.get(i));
            list.set(i,temp);

            heapify(list,i,0);

        }

    }

   private static void heapify(List<Integer> list, int n, int root){

        int largest = root;
        int left = 2*root + 1;
        int right = 2*root + 2;

        if(left < n && list.get(left) > list.get(largest)){
            largest = left;
        }
        if(right < n && list.get(right) > list.get(largest)){
            largest = right;
        }

        if(largest != root){
            int temp = list.get(largest);
            list.set(largest,list.get(root));
            list.set(root,temp);

            heapify(list,n,largest);
        }

    }



}
