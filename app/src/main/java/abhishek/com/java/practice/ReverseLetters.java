package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 21/7/16.
 */
public class ReverseLetters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sampleText = in.nextLine();

        StringBuilder str = new StringBuilder();
        str.append(sampleText);


        System.out.println(str.reverse());
    }
}
