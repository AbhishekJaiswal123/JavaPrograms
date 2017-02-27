package abhishek.com.java.practice;

/**
 * Created by abhishek on 18/1/17.
 */

public class IntegerReverse {


    public static void main(String[] args) {

        System.out.println(reverse(-1146467285));
    }

    public static int reverse(int a) {

        boolean neg = false;
        if(a < 0){
            neg  = true;
            a    = Math.abs(a);
        }
        int result = 0 ;
        for(int i = a ; i != 0 ; i /= 10){
            result = result * 10 + i % 10;
        }
        if(neg)
            result = -result;

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return result;

    }

}
