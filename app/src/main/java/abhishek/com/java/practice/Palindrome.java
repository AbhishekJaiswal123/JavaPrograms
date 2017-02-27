package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 21/7/16.
 */
public class Palindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String palinCheck = in.nextLine();

        StringBuilder builder = new StringBuilder();
        builder.append(palinCheck);
        String reverse =  builder.reverse().toString();
        if(palinCheck.equalsIgnoreCase(reverse))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
