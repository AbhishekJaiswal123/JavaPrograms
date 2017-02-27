package abhishek.com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by abhishek on 21/7/16.
 */
public class DuplicateAlphabet {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        
        char[] textChar = text.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : textChar)
        {
            if(map.containsKey(ch)){
                int value = map.get(ch);
                map.put(ch,value+1);
            }else{
                map.put(ch,1);
            }
        }

       for(Map.Entry<Character,Integer> entry : map.entrySet()){
           if(entry.getValue() > 1){
               System.out.println("Repeating alphabets is " + entry.getKey()+ " = "+entry.getValue());
           }
       }
    }
}
