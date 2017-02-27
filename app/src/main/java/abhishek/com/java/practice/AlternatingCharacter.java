package abhishek.com.java.practice;

import java.util.Scanner;

/**
 * Created by abhishek on 13/11/16.
 */

public class AlternatingCharacter {



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i = 0 ; i < T ; i++){
            int count = 0;
            String text = scan.nextLine();
            char[] letters = text.toCharArray();

            if(letters.length > 0){
                char character = letters[0];

                for(int j = 1 ; j < letters.length ; j++){

                    if(character == letters[j]){
                        count++;
                    }else{
                        character = letters[j];
                    }
                }
            }
            System.out.println(count);
        }
        scan.close();
    }

}
