package abhishek.com.java.practice;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abhishek on 24/1/17.
 */

public class ReArrange {


    public static void main(String[] args) {

        Integer[] a = {3, 2, 0, 1};
        arrange(Arrays.asList(a));
    }

    public static List<Integer> arrange(List<Integer> a) {

        int size = a.size();
        for (int i = 0 ; i < size ; i++){
           int val = a.get(i)+((a.get(a.get(i)) % size)*size);
            a.set(i,val);
        }
        for(int i = 0 ; i < size ; i++){
            a.set(i,a.get(i)/size);
        }
       return a;

    }
}
