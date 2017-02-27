package abhishek.com.java.practice;

/**
 * Created by abhishek on 16/1/17.
 */

public class PowerOfTwo {

    public static void main(String[] args) {

        System.out.println(isPower(1024000000) ? "True": "False");
    }


    public static boolean isPower(int a) {


     //   int len = String.valueOf(a).length();
            for(int i = 2 ; i <= Math.sqrt(a) ; i++){
            System.out.println("Number : "+ i);
            double num = i;
            while (num <= a){
                num = num * i;
                if(num == a)
                    return true;
            }
        }


        return false;
    }
}
