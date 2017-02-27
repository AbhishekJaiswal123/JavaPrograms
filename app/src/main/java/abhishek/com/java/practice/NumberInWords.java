package abhishek.com.java.practice;

import java.util.Scanner;

public class NumberInWords {

    String one[] = {" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " Nine", " ten", " eleven", " twelve", " thirteen", " fourteen", "fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};

    String ten[] = {" ", " ", " twenty", " thirty", " forty", " fifty", " sixty", "seventy", " eighty", " ninety"};


    private void print(int number , String mText){

        if(number > 19){
            System.out.print(ten[number/10]+" "+one[number%10]);
        }else{
            System.out.print(one[number]);
        }
        if(number > 0)System.out.print(mText);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = in.nextInt();
        NumberInWords numToWords = new NumberInWords();
        numToWords.print(number/1000000000,"Hundred");
        numToWords.print((number/10000000)%100,"Crore");
        numToWords.print((number/100000)%100,"Lakhs");
        numToWords.print((number/1000)%100,"Thousand");
        numToWords.print((number/100)%10,"Hundred");
        numToWords.print(number%100," ");



    }
}