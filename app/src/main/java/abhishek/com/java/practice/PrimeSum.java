package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by abhishek on 15/1/17.
 */

public class PrimeSum {


    public static void main(String[] args) {

        //System.out.println(Arrays.asList(primesum(16777214)).toString());
        System.out.println(Arrays.asList(primesum(16777214)).toString());

    }


    public static ArrayList<Integer> primesum(int a) {

        TreeMap<Integer,Integer> allPrimes = new TreeMap<>();

        ArrayList<Integer> result = new ArrayList<>();

        getPrimesSeiveOfEratosthenes(a,allPrimes);


            for (Map.Entry<Integer, Integer> entry : allPrimes.entrySet()) {

                int temp = a - entry.getKey();
                if(allPrimes.containsKey(temp)){
                    result.add(entry.getKey());
                    result.add(temp);
                    return result;
                }

            }

        return null;
    }

    public static  Map<Integer, Integer> getAllPrimes(int a){
        Map<Integer,Integer> primes = new TreeMap<>();
        for(int i = 2 ; i < a ; i++){
            if(isPrime(i))
                primes.put(i,i);
        }
        return primes;
    }

    public static boolean isPrime(int a){
        if(a == 2)
            return true;
        int upperLimit  =(int) Math.ceil(Math.sqrt(a));
        for(int i = 2 ; i <= upperLimit ; i++){
            if(a % i == 0)
                return false;
        }


        return true;
    }

    public static void getPrimesSeiveOfEratosthenes(int a,TreeMap<Integer,Integer> primes){
        for(int i = 2 ; i <= a ; i++){
            primes.put(i,1);
        }
        int upperLimit  =(int) Math.ceil(Math.sqrt(a));
        for(int i = 2 ; i <= upperLimit ; i++){

            if(primes.containsKey(i)){
                if(primes.get(i) == 1){
                    for(int j = 2 ; i*j <= a ; j++){
                        primes.remove((i*j));
                    }
                }
            }

        }

    }
}
