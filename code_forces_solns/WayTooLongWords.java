package code_forces_solns;
//https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;

public class WayTooLongWords {
    public static void convertLongWords(String word){
        int length = word.length();
        String convertedWord = "";
        convertedWord += word.charAt(0);
        convertedWord += length-2;
        convertedWord += word.charAt(length-1);
        System.out.println(convertedWord);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            String word = s.next();
            if(word.length()>10){
                convertLongWords(word);
            }else{
                System.out.println(word);
            }
        }
        s.close();
    }
}
