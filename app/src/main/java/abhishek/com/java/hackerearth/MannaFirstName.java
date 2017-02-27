package abhishek.com.java.hackerearth;

import java.util.Scanner;

/**
 * Created by abhishek on 8/12/16.
 */

public class MannaFirstName {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int i = 0 ; i < T ; i++){

            String str = scan.next();

            int suvo = str.split("SUVO").length;
            int  suvojit = str.split("SUVOJIT").length;



            if(suvo == suvojit){
                suvo = 0;
                suvojit = suvojit -1;
            }else{
                suvo = suvo - suvojit;
                suvojit--;
            }


            System.out.print("suvo = " + suvo);
            System.out.println("  suvojit = " + suvojit);
        }
    }
}
