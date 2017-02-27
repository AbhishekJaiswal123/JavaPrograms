package abhishek.com.java.practice;

/**
 * Created by abhishek on 14/1/17.
 */

public class Pattern2 {

    public static void main(String[] args) {

        int n = 6;
        for(int i = 0 ; i < 2*n-1; i++){
            for (int j=0 ; j < 2*n-1 ; j++){
                int val = 1+ Math.max(Math.abs(n-i-1),Math.abs(n-j-1));
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
