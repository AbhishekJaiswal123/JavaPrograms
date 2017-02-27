package abhishek.com.java.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by abhishek on 6/10/16.
 */

public class RansomeNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public RansomeNote(String magazine, String note) {

        magazineMap = new HashMap<>();
        noteMap = new HashMap<>();

        String[] magazineWords = magazine.split(" ");
        String[] noteWords = note.split(" ");

        for(int i = 0 ; i < magazineWords.length ; i++){
            int value = magazineMap.containsKey(magazineWords[i]) ? magazineMap.get(magazineWords[i]) : 0;
            magazineMap.put(magazineWords[i],1+value);
        }

        for(int j = 0 ; j < noteWords.length ; j++){
            int value = noteMap.containsKey(noteWords[j]) ? noteMap.get(noteWords[j]) : 0;
            noteMap.put(noteWords[j],1+value);
        }
    }

    public boolean solve() {
        List<String> notes = new ArrayList<String>(noteMap.keySet());
        for(String word : notes){

            if(magazineMap.containsKey(word)){
                if(noteMap.get(word) != magazineMap.get(word)){
                    return false;
                }
            }else{
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        RansomeNote s = new RansomeNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}

