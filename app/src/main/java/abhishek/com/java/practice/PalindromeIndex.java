package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 13/11/16.
 */

public class PalindromeIndex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for(int i = 0 ; i < T ; i++){

            String input = in.nextLine();
            int len = input.length();
            int index = -1;
            if(len > 0){
                if(checkPalindrome(input.substring(0,len-1))){
                    index = len-1;
                }
                else if(checkPalindrome(input.substring(1,len))){
                    index = 0;
                }else{
                    index = getIndex(input);
                }
            }
            System.out.println(index);
        }


    }

    private static int getIndex(String str){

        int low = 0;
        int high = str.length()-1;

        while(low <= high){

            if(str.charAt(low) != str.charAt(high)){

                if(str.charAt(low) == str.charAt(high-1)){
                    if(checkPalindrome(str.substring(low,high)))
                       return high;
                    else{
                        return low;
                    }
                }else if(str.charAt(high) == str.charAt(low+1)){
                    return low;
                }

            }
            low++;
            high--;
        }


        return -1;
    }


    private static boolean checkPalindrome(String str){

        int low = 0;
        int high = str.length()-1;
        while(low <= high){

            if(str.charAt(low) != str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}