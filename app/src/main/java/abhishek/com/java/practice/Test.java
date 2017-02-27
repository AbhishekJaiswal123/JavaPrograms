package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 20/7/16.
 */
public class Test {


    public static void main(String args[]){

      int number[] = {1,3,6,3,2,7,8,3,4,0};

        Scanner in = new Scanner(System.in);
        int SUM = in.nextInt();

        for(int i = 0 ; i < number.length ; i++){

            for(int j = 0 ; j < number.length && j != i ; j++){
                if(number[i]+number[j] == SUM){
                    System.out.println("Paired Number whose sum is = " + SUM+ " is {"+ number[i] + ", "+ number[j]+" }");
                }
            }
        }

    }
}
