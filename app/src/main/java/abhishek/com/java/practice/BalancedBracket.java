package abhishek.com.java.practice;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by abhishek on 8/12/16.
 */

public class BalancedBracket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String s = in.next();
            Stack<Character> stack = new Stack<>();
            String result = "YES";

            try {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 40 || s.charAt(i) == 91 || s.charAt(i) == 123) {
                        stack.push(s.charAt(i));
                    } else {
                        int ch = stack.pop();

                        if (ch == 40) {
                            if (s.charAt(i) != 41) {
                                result = "NO";
                            }
                        } else if (ch == 91) {
                            if (s.charAt(i) != 93) {
                                result = "NO";
                            }
                        } else if (ch == 123) {
                            if (s.charAt(i) != 125) {
                                result = "NO";
                            }
                        }
                    }
                }

            } catch (Exception e) {
                result = "NO";
            }

            if(stack.isEmpty())
               System.out.println(result);
            else
                System.out.println("NO");
        }
    }
}
