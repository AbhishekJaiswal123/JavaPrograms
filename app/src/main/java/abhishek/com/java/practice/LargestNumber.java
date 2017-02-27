package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by abhishek on 7/1/17.
 */

public class LargestNumber {


    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(30);
        a.add(34);
        a.add(5);
        a.add(9);

        System.out.println("SORTED IS : "+largestNumber1(a));

    }



    public static String largestNumber1(final List<Integer> a) {

        List<Integer> list = new ArrayList<>();
        list.addAll(a);
        StringBuilder builder = new StringBuilder();
        for(int i = 1 ; i < a.size() ; i++){

            int j = i-1;
            int key = a.get(i);

            while(j >= 0 && (key+""+a.get(j)).compareTo(a.get(j)+""+key) > 0){
                a.set(j+1,a.get(j));
                j--;

            }
            builder.insert(0,key);
            a.set(j+1,key);
        }
        return builder.toString();
    }

    public static String largestNumber(final List<Integer> a) {


        Collections.sort(a,new Compare());
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < a.size() ;i++){
            builder.append(a.get(i));
        }

        return builder.toString();
    }
}

class Compare implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {

        if(Integer.parseInt(num2+""+num1) <  Integer.parseInt(num1+""+num2)){
            return 1;
        }else{
            return 0;
        }
    }
}


