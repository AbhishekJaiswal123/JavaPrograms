package abhishek.com.java.hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by abhishek on 8/12/16.
 */

public class Test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();
        String pixels = scanner.nextLine();
        pixels = pixels.replaceAll("\\s+","");
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : pixels.toCharArray()) {
            int value = map.containsKey(ch) ? map.get(ch)+1 : 1;
            map.put(ch,value);
            
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() >= k){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
