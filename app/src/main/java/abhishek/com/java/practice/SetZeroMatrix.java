package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhishek on 13/1/17.
 */

public class SetZeroMatrix {

    public static void main(String[] args) {
        List<ArrayList<Integer>> a = new ArrayList<>();


        for(int i = 0 ; i < 3 ; i++){
            ArrayList<Integer> list = new ArrayList<>();

            if(i == 0)
              list.add(0);
            else if(i == 1)
                list.add(0);
            else list.add(1);
            list.add(1);
            list.add(1);

            a.add(list);
        }

        for(int i = 0 ; i < a.size() ; i++){
            for (int j = 0 ; j < a.size() ; j++){
                System.out.print(a.get(i).get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        setZeroes(a);


    }

    public static  void setZeroes(List<ArrayList<Integer>> a) {

        boolean firstRowZero = false;
        boolean firstColumnZero = false;

        //set first row and column zero or not
        for(int i=0; i<a.size(); i++){
            if(a.get(i).get(0) == 0){
                firstColumnZero = true;
                break;
            }
        }

        for(int i=0; i<a.get(0).size(); i++){
            if(a.get(0).get(i) == 0){
                firstRowZero = true;
                break;
            }
        }

        //mark zeros on first row and column
        for(int i=1; i<a.size(); i++){
            for(int j=1; j<a.get(0).size(); j++){
                if(a.get(i).get(j) == 0){
                    a.get(i).set(0,0);
                   a.get(0).set(j,0);
                }
            }
        }

        //use mark to set elements
        for(int i=1; i<a.size(); i++){
            for(int j=1; j<a.get(0).size(); j++){
                if(a.get(i).get(0) == 0 || a.get(0).get(j) == 0){
                    a.get(i).set(j,0);

                }
            }
        }

        //set first column and row
        if(firstColumnZero){
            for(int i=0; i<a.size(); i++)
               a.get(i).set(0,0);
        }

        if(firstRowZero){
            for(int i=0; i<a.get(0).size(); i++)
               a.get(0).set(i,0);
        }

        for(int i = 0 ; i < a.size() ; i++){
            for (int j = 0 ; j < a.size() ; j++){
                System.out.print(a.get(i).get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

    }

}
