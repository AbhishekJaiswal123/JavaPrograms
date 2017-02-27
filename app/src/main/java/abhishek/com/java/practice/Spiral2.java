package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by abhishek on 10/1/17.
 */

public class Spiral2  {

    public static void main(String[] args) {

        System.out.println("Generate :"+generateMatrix(80));

    }

    public static ArrayList<ArrayList<Integer>> generateMatrix(int a) {

        int top = 0;
        int bottom = a-1;
        int left = 0;
        int right = a-1;
        int dir = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i < a ; i++){
            list.add(new ArrayList<>(Collections.nCopies(a, 0)));
        }

        int k = 1;
        while(k <= a*a){


                for(int i = left ; i <= right ; i++){
                    list.get(top).set(i,k++);

                }
                top++;


                for(int i = top ; i <= bottom ; i++){
                    list.get(i).set(right,k++);
                }
                right--;


                for(int i = right ; i >= left ; i--){
                    list.get(bottom).set(i,k++);
                }
                bottom--;

                for(int i = bottom ; i >= top ; i--){
                    list.get(i).set(left,k++);
                }
                left++;


        }



        return list;
    }
}
