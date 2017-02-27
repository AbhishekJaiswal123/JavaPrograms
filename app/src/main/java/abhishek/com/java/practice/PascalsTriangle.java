package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 8/1/17.
 */

public class PascalsTriangle {



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int row = s.nextInt();

        printPascalTriangle(row);
    }


    private static void printPascalTriangle(int r){

        for(int i = 0 ; i < r ; i++){
            int number = 1;
            for(int j = r ; j > i ; j--){
                System.out.print(" ");
            }

            for(int k = 0 ; k <= i ; k++){
                System.out.print(number+" ");
                number = number * (i - k)/(k+1);
            }

            System.out.println();

        }
    }
}
