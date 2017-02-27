package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhishek on 8/1/17.
 */

public class SpiralArray {

    public static void main(String[] args) {


        List<ArrayList<Integer>> a = new ArrayList<>();

        for(int i = 0 ; i < 3 ; i++){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);

            a.add(list);
        }
        spiralOrder(a);

    }

    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int T = 0;
        int B = a.size()-1;
        int L = 0;
        int R = a.get(0).size()-1;

        int direction = 0;

        while(L <= R && T <= B){

            if(direction == 0){
                for(int i = L ; i <= R ; i++)
                    result.add(a.get(T).get(i));

                T++;
                direction = 1;
            } else if(direction == 1){

                for(int i = T ; i <= B ; i++)
                    result.add(a.get(i).get(R));

                R--;
                direction  = 2;


            }else if(direction == 2){
                for(int i = R ; i >= L ; i--)
                    result.add(a.get(B).get(i));

                B--;
                direction  = 3;

            }else {
                for(int i = B ; i >= T ; i--)
                    result.add(a.get(i).get(L));
                L++;
                direction  = 0;

            }
        }

        return result;
    }

}
