package abhishek.com.java.practice;
/**
 * Created by abhishek on 5/10/16.
 */

public class Kaprekar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named LexicographicalNextString. */
      //  Scanner scan = new Scanner(System.in);
        long p = 99998;
        long q = 99999;
        int count = 0;

        for(long i = p ; i <= q ; i++){

            String square = String.valueOf(i*i);
            if(square.length() == 1){
                if(square.equals("1"))
                    System.out.print(i+" ");
            }else{

                int pivot = square.length()/2;

                int firstHalf = Integer.valueOf(square.substring(0,pivot));
                int secondHalf = Integer.valueOf(square.substring(pivot,square.length()));

                if((firstHalf+secondHalf) == i){
                    count++;
                    System.out.print(i+" ");
                }

            }
        }
        if(count == 0){
            System.out.print("INVALID RANGE");
        }
    }
}