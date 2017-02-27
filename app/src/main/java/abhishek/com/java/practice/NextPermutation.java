package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by abhishek on 12/1/17.
 */

public class NextPermutation {

    public static void main(String[] args) {

        Integer[] a = {7};
        List<Integer> list = new ArrayList<>(Arrays.asList(a));

        nextPermutation(list);
    }

    public static void nextPermutation(List<Integer> a) {


        int i = a.size()-1;

        while(i>0 && a.get(i-1) >= a.get(i)){
            i--;
        }
        int pivot = 0;
        if(i>0)
         pivot = a.get(i-1);


        int j = a.size()-1;
        while(j>i && a.get(j) < pivot)
            j--;


        if(i > 0) {
            int temp = a.get(j);
            a.set(j, pivot);
            a.set(i - 1, temp);
        }

        int k = a.size()-1;
        while(i < k){
            int temp1 = a.get(i);
            a.set(i,a.get(k));
            a.set(k,temp1);
            i++;
            k--;
        }

        System.out.println(Arrays.asList(a).toString());

    }
    
    

    


}
