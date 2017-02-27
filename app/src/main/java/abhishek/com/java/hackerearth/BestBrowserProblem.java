package abhishek.com.java.hackerearth;

import java.util.Scanner;

/**
 * Created by abhishek on 7/12/16.
 */


class BestBrowserProblem {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        s.nextLine();
        for (int i = 0; i < T; i++) {


            String str = s.nextLine();

            int fastSpeedLength = 0;

            String websiteName = str.split("\\.")[1];

            for(int j = 0 ; j < websiteName.length() ; j++){

                if(isVowel(websiteName.charAt(j))){
                    fastSpeedLength++;
                }
            }

            fastSpeedLength = (websiteName.length() - fastSpeedLength) + 4;
            System.out.println(fastSpeedLength+ "/" + str.length());


        }


    }

    private static boolean isVowel(char c){

        return "AEIOUaeiou".indexOf(c) != -1;
    }
}