package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 12/10/16.
 */

public class BeatyBinary {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named LexicographicalNextString. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String input = scan.nextLine();
        String findStr = "010";

        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = input.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                System.out.println(count);
                lastIndex += findStr.length();
            }
        }

        System.out.println(count);
    }
}
