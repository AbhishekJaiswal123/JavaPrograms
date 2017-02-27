package abhishek.com.java.practice;

import java.util.ArrayList;

/**
 * Created by abhishek on 24/1/17.
 */

public class SOEratosthenes {

    public static void main(String[] args) {

        System.out.println(sieve(15));
    }

    public static ArrayList<Integer> sieve(int a) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0 ; i <= a ; i++){
            list.add(i,1);
        }
        list.set(0,0);
        list.set(1,0);

        for(int i = 2 ; i <= Math.sqrt(a) ; i++){

            if(list.get(i) == 1){
                for(int j = 2 ; i*j <= a ; j++){
                    list.set(i*j,0);
                }
            }
        }

        for(int i = 0 ; i <= a ; i++){
            if(list.get(i) == 1){
                result.add(i);
            }
        }

        return result;
    }
}
