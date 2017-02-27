package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 13/10/16.
 */

public class CeaserCipher {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named LexicographicalNextString. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        String S = scan.nextLine();
        int K = scan.nextInt();
        scan.close();


        for(int i = 0 ; i < N ; i++){

            char c = S.charAt(i);
            if((c >= 65 && c <= 90)&&(c >= 97 && c <= 122)){
                if(Character.isUpperCase(c)){
                    int val = c + K;
                    if(val >= 65 && val<=90){
                        char ch = (char)val;
                        // S = S.replace(c,ch);
                        S = S.substring(0, i) + ch + S.substring(i + 1);
                    }else{
                        char ch1 = (char)(val - 90 + 64);
                        // S = S.replace(c,ch1);
                        S = S.substring(0, i) + ch1 + S.substring(i + 1);
                    }


                }else{

                    int val1 = c + K;
                    if(val1 >= 97 && val1<=122){
                        char ch2 = (char)val1;
                        // S = S.replace(c,ch2);
                        S = S.substring(0, i) + ch2 + S.substring(i + 1);
                    }else{
                        char ch3 = (char)(val1 - 122 + 96);
                        //  S = S.replace(c,ch3);
                        S = S.substring(0, i) + ch3 + S.substring(i + 1);
                    }

                }
            }
        }
        System.out.println(S);
    }
}