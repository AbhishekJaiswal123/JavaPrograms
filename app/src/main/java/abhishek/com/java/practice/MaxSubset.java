package abhishek.com.java.practice;

import java.util.ArrayList;

/**
 * Created by abhishek on 6/1/17.
 */

public class MaxSubset {


    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(336465782);
        a.add(-278722862);
        a.add(-2145174067);
        a.add(1101513929);
        a.add(1315634022);
        a.add(-1369133069);
        a.add(-1059961393);

        a.add(628175011);
        a.add(-1131176229);
        a.add(-859484421);


        maxset(a);
    }

    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        int size = A.size();
        if(B > size){
            B = B % size;
        }

        for (int i = 0; i < A.size(); i++) {

            if(i+B >= size){
              ret.add(A.get(i+B - size));
            }else{
               ret.add(A.get(i+B));
            }

        }
        return ret;
    }


        public static ArrayList<Integer> maxset(ArrayList<Integer> a) {

            ArrayList<ArrayList<Integer>> subsetList = new ArrayList<>();

             boolean flag = true;
             ArrayList<Integer> subset = null;
            for(int i = 0 ; i < a.size() ; i++){

                if(flag){
                    subset = new ArrayList<>();
                    flag = false;
                }
                if(a.get(i) < 0){

                    subsetList.add(subset);
                    flag = true;

                }else{

                    subset.add(a.get(i));

                }


            }
            subsetList.add(subset);
            int max = 0;
            long maxSum = 0;
            for(int i = 0 ; i < subsetList.size() ; i++){
                ArrayList<Integer> sub = subsetList.get(i);
                long sum = 0;
                for(int j = 0 ; j < sub.size() ; j++){
                    sum += sub.get(j);
                }
                if(sum > maxSum){
                    maxSum = sum;
                    max = i;
                }

            }

            return subsetList.get(max);
        }


}
