package abhishek.com.java.practice;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by abhishek on 14/12/16.
 */

public class TheToss {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String weather = scan.next();
        String dayNight = scan.next();

        Random toss = new Random();
        int tossResult = toss.nextInt(2);
        String result = "";

        if(tossResult == 0){
            result = "Lengaburu wins toss and ";
            if(weather.equalsIgnoreCase("clear") && dayNight.equalsIgnoreCase("day")){
                result += "bats";
            }else if(weather.equalsIgnoreCase("clear") && dayNight.equalsIgnoreCase("night")){
                result += "bats";
            }else if(weather.equalsIgnoreCase("cloudy") && dayNight.equalsIgnoreCase("day")){
                result += "bats";
            }else if(weather.equalsIgnoreCase("cloudy") && dayNight.equalsIgnoreCase("night")){
                result += "bowls";
            }
        }else {
            result = "Enchai wins toss and ";
            if (weather.equalsIgnoreCase("clear") && dayNight.equalsIgnoreCase("day")) {
                result += "bowls";
            } else if (weather.equalsIgnoreCase("clear") && dayNight.equalsIgnoreCase("night")) {
                result += "bats";
            } else if (weather.equalsIgnoreCase("cloudy") && dayNight.equalsIgnoreCase("day")) {
                result += "bats";
            } else if (weather.equalsIgnoreCase("cloudy") && dayNight.equalsIgnoreCase("night")) {
                result += "bats";
            }
        }

        System.out.println(result);
    }
}
