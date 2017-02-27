package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhishek on 13/1/17.
 */

public class ShiftMatrix {

    public static void main(String[] args) {


        List<ArrayList<Integer>> a = new ArrayList<>();

        int k = 1;
        for(int i = 0 ; i < 3 ; i++){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(k++);
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

        shift(a);

    }



    public static void shift(List<ArrayList<Integer>> a) {

        int top = 0;
        int left = 0;
        int right = a.size()-1;
        int bottom = a.size()-1;

        while(top < bottom && left < right){
            System.out.println("Top : "+top+" left :"+left);
            System.out.println("Bottom : "+bottom+" Right :"+right);
            int temp = a.get(top).get(left);

            //top to bottom

            for(int i = top+1 ; i <= bottom ;i++){
                a.get(i-1).set(left,a.get(i).get(left));

            }
            left++;


            // left to Right
            for(int i = left ; i <= right ; i++){
                a.get(bottom).set(i-1,a.get(bottom).get(i));
            }
            bottom--;

            // bottom to top
            for(int i = bottom ; i >= top ; i--){
                a.get(i+1).set(right,a.get(i).get(right));
            }
            right--;

           //right to left
            for(int i = right ; i >= left ; i--){
                a.get(top).set(i+1,a.get(top).get(i));
            }

            a.get(top).set(left,temp);
            top++;

            System.out.println("Top : "+top+" left :"+left);
            System.out.println("Bottom : "+bottom+" Right :"+right);


        }

        for(int i = 0 ; i < a.size() ; i++){
            for (int j = 0 ; j < a.size() ; j++){
                System.out.print(a.get(i).get(j)+ " ");
            }
            System.out.println();
        }

    }


}
