package abhishek.com.java.test;

/**
 * Created by abhishek on 26/1/17.
 */

public class Pattern {


    public static void main(String[] args) {

        printDiamond(5);
    }


    private static void printDiamond(int n){

        for(int i = 0 ; i < 2*n-1 ; i++){

            for(int j = 0 ; j < Math.abs(n-i-1);j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k < 2*(n-Math.abs(n-i-1))-1 ; k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
