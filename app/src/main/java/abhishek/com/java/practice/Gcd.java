package abhishek.com.java.practice;

/**
 * Created by abhishek on 20/1/17.
 */

public class Gcd {

    public static void main(String[] args) {

        System.out.println(gcd(1,0));
    }

    public static int gcd(int a, int b) {

        int gcd = 1;

        if(a == 0)
            return b;

        if(b == 0)
            return a;

        if(a <= b){
            if(b % a == 0)
                 return a;

        }else{
            if(a % b == 0)
                return b;
        }

        for(int i = 1 ; i <= a && i <= b ; i++){

            if((a % i == 0) && (b % i == 0))
                gcd = i;
        }

        return gcd;
    }
}
