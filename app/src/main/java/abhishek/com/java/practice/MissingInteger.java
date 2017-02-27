package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by abhishek on 8/1/17.
 */

public class MissingInteger {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);



        System.out.println("Missing Integer : "+firstMissingPositive(list));
    }

    public static int firstMissingPositive1(ArrayList<Integer> a) {

        int size = a.size();


        List<Integer> list = new ArrayList<>(Collections.nCopies(size+1, 0));


        for(int i = 0 ; i < size ; i++){

           if(a.get(i) >= 0){
               list.set(a.get(i),1);
           }

        }
        for(int i = 1 ; i < size+1 ; i++){
            if(list.get(i) == 0){
                return i;
            }
        }

      return 1;
    }

    public static int firstMissingPositive(ArrayList<Integer> A) {
        int n = A.size();

        for (int i = 0; i < n; i++) {
            while (A.get(i) != i + 1) {
                if (A.get(i) <= 0 || A.get(i) >= n)
                    break;

                if(A.get(i)==A.get(A.get(i)-1))
                    break;

                int temp = A.get(i);
                A.set(i,A.get(temp-1));
                A.set(temp - 1,temp);

            }
        }

        for (int i = 0; i < n; i++){
            if (A.get(i) != i + 1){
                return i + 1;
            }
        }

        return n + 1;
    }

    public static int firstMissingPositiveSol(ArrayList<Integer> A) {

        int n = A.size() + 1;
        int count;
        int idx = 0;
        int size = A.size();
        count = size - 1;

        for (idx = size - 1; idx >= 0; idx--) {

            int num = A.get(idx);

            if (num < 0) {
                int val = A.get(count);
                A.set(idx, val);
                A.set(count, num);
                count--;
            }

        }

        for (idx = 0; idx <= count; idx++) {

            int num = A.get(idx);

            num = Math.abs(num);

            if (num > 0 && num < n) {

                int index = num - 1;
                int val = A.get(index);
                A.set(index, -val);

            }

        }

        for (idx = 0; idx <= count; idx++) {

            int num = A.get(idx);

            if (num > 0) {
                return idx + 1;
            }

        }

        return idx + 1;

    }
}
