package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 13/11/16.
 */

public class LoveLetter {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();

    for(int i = 0 ; i < T ; i++){
        String str = in.next();
        System.out.println(makePalindrome(str));

    }
}

    private static int makePalindrome(String str){
        int low = 0;
        int high = str.length() - 1;
        int count = 0;
        while(low <= high){
            char first = str.charAt(low);
            char second = str.charAt(high);
            if(first != second){
                int ops = 0;
                if(first < second){
                    ops = second - first;
                    count += ops;
                }else{
                    ops = first - second;
                    count += ops;
                }
            }
            low++;
            high--;
        }
        return count;
    }
}