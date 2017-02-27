package abhishek.com.java.practice;

import java.util.ArrayList;

/**
 * Created by abhishek on 8/1/17.
 */

public class PascalsTest {

    public static void main(String[] args) {

        generate(5);
        getRow(5);

    }

    public static ArrayList<Integer> getRow(int a) {

        int number = 1;
        ArrayList<Integer> list = new ArrayList<>();



        for(int j = 0 ; j <= a ; j++){
            list.add(number);
            number = number * (a - j)/(j + 1);


        }

        return list;


    }

    public static ArrayList<ArrayList<Integer>> generate(int a) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i = 0 ; i < a ; i++){

            int number = 1;
            ArrayList<Integer> row = new ArrayList<>();

            for(int j = 0 ; j <= i ; j++){

                row.add(number);
                number = number * (i - j)/(j + 1);

            }
            result.add(row);

        }

        return result;
    }
}
