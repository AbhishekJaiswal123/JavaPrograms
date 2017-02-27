package abhishek.com.java.practice;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by abhishek on 9/12/16.
 */

public class TextEditor {

    static class wordOperation{
        String word;
        int t;

        wordOperation(String word,int t){
            this.word = word;
            this.t = t;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        Stack<wordOperation> heap = new Stack<>();

        String s = "";
        for(int i = 0 ; i < Q ; i++){
            int t  = scan.nextInt();

            if(t == 1){
                String inputstr = scan.next();
                s = s + inputstr;
                heap.push(new wordOperation(inputstr,1));
            }else if(t == 2){
                int k = scan.nextInt();
                if(s.length() >= k){
                    heap.push(new wordOperation(s.substring(s.length()-k),2));
                    s = s.substring(0,s.length()-k);

                }


            }else if(t == 3){

                int k = scan.nextInt();
                System.out.println(s.charAt(k-1));

            }else {

                wordOperation ops = heap.pop();
                if(ops.t == 1){
                    s = s.substring(0,s.length()-ops.word.length());
                }else{
                    s = s + ops.word;
                }
            }


        }
    }
}