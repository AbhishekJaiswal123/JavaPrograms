package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 13/11/16.
 */

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i = 0 ; i < T ; i++){

            String input = scan.nextLine();
            StringBuilder builder = new StringBuilder();
            builder.append(input);
            String reverse = builder.reverse().toString();
            boolean funny = true;

            for(int j = 1 ; j < input.length() ; j++){
                int first = Math.abs((input.charAt(j))- (input.charAt(j-1))) ;
                int sec = Math.abs((reverse.charAt(j))- (reverse.charAt(j-1))) ;
                if(first != sec){
                    funny = false;
                    System.out.println("Not Funny");
                    break;
                }
            }
            if(funny){
                System.out.println("Funny");
            }

        }
    }

}