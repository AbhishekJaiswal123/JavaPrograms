package abhishek.com.java.practice;

/**
 * Created by abhishek on 16/1/17.
 */

public class ReverseTheString {

    public static void main(String[] args) {

        String reverse = reverseWords(" ankrqzzcel  dyaiug y rkicv t");

        System.out.println(reverse);
    }

    public static String reverseWords(String a) {

        a  = a.replaceAll("\\s+"," ").trim();

        String[] str = a.split(" ");
        int len = str.length-1;
        String reverse = "";
        while (len >= 0){
            if(len == 0)
                reverse = reverse+ str[len--].trim();
            else
               reverse = reverse+ str[len--].trim()+" ";
        }

        return reverse;
    }
}
