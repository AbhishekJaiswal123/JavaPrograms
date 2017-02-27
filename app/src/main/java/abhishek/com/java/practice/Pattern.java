package abhishek.com.java.practice;

/**
 * Created by abhishek on 14/1/17.
 */

public class Pattern {

    public static void main(String[] args) {

        int n = 5;
        int count = 1;
        for(int i= 0 ; i < 2*n-1 ; i++){
            for(int j = 0 ; j < Math.abs(n-i-1) ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2 * (n-Math.abs(n-i-1))-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }



}
