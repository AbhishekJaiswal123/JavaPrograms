package abhishek.com.java.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by abhishek on 8/12/16.
 */

public class Test1 {


    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            while ((line = r.readLine()) != null) {
                str.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*while(scan.hasNext()){
            str.add(scan.nextLine());
        }*/
       /* String[] str = new String[N];
        for(int i = 0 ; i < N ; i++){
            str[i] = scan.nextLine();
        }*/
        Collections.sort(str);

        for(int j = 0 ; j < str.size() ; j++){

            String phrase = str.get(j).replaceAll("\\s+","");

            StringBuilder builder = new StringBuilder();
            builder.append(str.get(j));
            for(int k = j+1 ; k < str.size() ; k++){

                if(!str.get(k).equalsIgnoreCase("")){
                    String temp = str.get(k).replaceAll("\\s+","");
                    if(checkAnagrams(phrase,temp)){
                        builder.append(","+str.get(k));
                        str.remove(k);
                    }
                }


            }
            System.out.println(builder.toString());

        }
    }


    private static boolean checkAnagrams(String str1, String str2){

        if(str1.length() == str2.length()){
            char[] text1ch = str1.toLowerCase().toCharArray();
            char[] text2ch = str2.toLowerCase().toCharArray();

            Arrays.sort(text1ch);
            Arrays.sort(text2ch);

            if(Arrays.equals(text1ch,text2ch)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }



}
