package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by abhishek on 15/1/17.
 */

public class Factors {


    public static void main(String[] args) {

      ArrayList<Integer> list =   allFactors(36);
        System.out.println(Arrays.asList(list));
    }

    public static ArrayList<Integer> allFactors(int a) {
        ArrayList<Integer> list = new ArrayList<>();
        int upperLimit = (int)Math.ceil(Math.sqrt(a));
        list.add(1);
        for(int i = 2 ; i <= upperLimit ; i++){
            if(a % i == 0){
                list.add(i);
                if(i != upperLimit)
                  list.add(a/i);
            }

        }


        list.add(a);

        return list;
    }
}
