package abhishek.com.java.practice;

import java.util.Arrays;
import java.util.List;

/**
 * Created by abhishek on 24/1/17.
 */

public class LongestCommonPrefix {


    public static void main(String[] args) {

        String[] a = { "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        List<String> list = Arrays.asList(a);
        System.out.println(longestCommonPrefix(list));

    }


    public static String longestCommonPrefix(List<String> a) {

        StringBuilder temp = new StringBuilder();
        String prefix;
        if(a.size() >= 2){

            String str1 = a.get(0);
            String str2 = a.get(1);



            for(int i = 0 ; i < str1.length() && i < str2.length() ; i++){

                if(str1.charAt(i) == str2.charAt(i)){
                    temp.append(str1.charAt(i));
                }
            }

            prefix = temp.toString();
            if(a.size() >= 3){
                for(int i = 2 ; i < a.size() ; i++){
                    String text = a.get(i);
                    int end = prefix.length() > text.length() ? text.length()-1 : prefix.length()-1;

                    for(int j = end ; j >= 0 ; j--){

                        if(prefix.contains(text)){
                            prefix = text;
                            break;
                        }

                        if(prefix.charAt(j) != text.charAt(j)){
                           prefix = prefix.substring(0,j);
                        }

                    }
                }
            }

        }else{
            return a.get(0);
        }

        return prefix.toString();
    }
}
