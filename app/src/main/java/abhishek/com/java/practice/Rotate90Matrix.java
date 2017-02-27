package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhishek on 13/1/17.
 */

public class Rotate90Matrix {

    public static void main(String[] args) {
        List<ArrayList<Integer>> a = new ArrayList<>();

        int k = 1;
        for(int i = 0 ; i < 2 ; i++){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(k++);
            list.add(k++);


            a.add(list);
        }
        for(int i = 0 ; i < a.size() ; i++){
            for (int j = 0 ; j < a.size() ; j++){
                System.out.print(a.get(i).get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        rotate(a);

    }

    public static void rotate(List<ArrayList<Integer>> a) {

       int n = a.size();
        int row = n/2;

        int col = n % 2 == 0 ? n/2 : n/2+1;
        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){

                int temp = a.get(i).get(j);
                a.get(i).set(j,a.get(n-j-1).get(i));
                a.get(n-j-1).set(i,a.get(n-i-1).get(n-j-1));
                a.get(n-i-1).set(n-j-1,a.get(j).get(n-i-1));
                a.get(j).set(n-i-1,temp);

            }
        }



        for(int i = 0 ; i < a.size() ; i++){
            for (int j = 0 ; j < a.size() ; j++){
                System.out.print(a.get(i).get(j)+ " ");
            }
            System.out.println();
        }

    }

}
