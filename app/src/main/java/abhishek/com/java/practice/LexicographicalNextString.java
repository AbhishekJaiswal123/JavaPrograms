package abhishek.com.java.practice;

import java.util.Scanner;

public class LexicographicalNextString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named LexicographicalNextString. */

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int m = 0 ; m < T ; m++){

            String word = scan.nextLine();
            char[] words = word.toCharArray();

            if(words.length == 1)
                System.out.println("no answer");
            else if(words.length == 2){
                if(words[0] < words[1]){

                    char temp = words[1];
                    words[1] = words[0];
                    words[0] = temp;

                    String res = new String(words);
                    System.out.println(res);
                }else{
                    System.out.println("no answer");
                }
            }
            else{
                int j = words.length-2;
                while(j >= 0 && (words[j] >= words[j+1])){
                    j--;
                }
                if(j < 0){
                    System.out.println("no answer");
                }else{
                    char greater = words[j+1];
                    int index = 0;
                    for(int i = j+1 ; i < words.length ; i++){
                        if((words[j] < words[i]) && words[i] <= greater){
                            index = i;
                            greater = words[i];
                        }else{
                            break;
                        }
                    }

                    char temp = words[j];
                    words[j] = words[index];
                    words[index] = temp;

                    for(int x = j+2 ; x < words.length ; x++){
                        int k = x-1;
                        char key = words[x];
                        while(k > j && words[k] > key){
                            words[k+1] = words[k];
                            k--;
                        }
                        words[k+1] = key;

                    }
                    String str = new String(words);
                    System.out.println(str);

                }
            }
        }
    }
}