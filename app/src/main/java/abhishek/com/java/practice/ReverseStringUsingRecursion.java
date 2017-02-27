package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 17/11/16.
 */

public class ReverseStringUsingRecursion {

    private String reverse = "";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        ReverseStringUsingRecursion rev = new ReverseStringUsingRecursion();
        System.out.println("str = " + rev.reverse(str));
    }

    private String reverse(String str){

        if(str.length() == 1)
            return str;

        reverse += str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));

        return reverse;
    }
}
