package abhishek.com.java.hackerearth;

/**
 * Created by abhishek on 8/12/16.
 */

public class SubstringProblem {


    public static void main(String[] args) {
        String str = "abcabcekgfhh";

        int MAX_LENGTH = 0;
        StringBuilder substring = new StringBuilder();

        for(int i = 0 ; i < str.length() ; i++){

            if(!substring.toString().contains(str.charAt(i)+"")){
                substring.append(str.charAt(i));
            }else{
                int subsLength = substring.length();
                MAX_LENGTH = Math.max(subsLength,MAX_LENGTH);
                substring = new StringBuilder();
            }

        }

        System.out.println(" Substring length= " + MAX_LENGTH);
    }
}
