package abhishek.com.java.practice;

/**
 * Created by abhishek on 19/1/17.
 */

public class Atoi {

    public static void main(String[] args) {

        System.out.println(atoi(" 7 U 0 T7165  0128862 089 39 5"));
    }


    /*A method to convert String to Int*/
    private static int atoi(String num){


        if(num == null || num.equalsIgnoreCase(""))
            return 0;

        num = num.trim();

        if(num.contains(" ")){
            num = num.split(" ")[0];
        }

        boolean negetiveFlag = false;

        int i = 0;

        if(num.charAt(i) == '+'){
            i++;
        }else if(num.charAt(i) == '-'){
            negetiveFlag = true;
            i++;
        }
        int len = num.length();
        double result = 0;
        while(len > i && num.charAt(i) >= '0' && num.charAt(i) <= '9'){
            result = result * 10 + (num.charAt(i) - '0');
            i++;
        }
        if(negetiveFlag)
             result = -result;


        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;


        return (int)result;
    }
}
