package basic_java_prog;

import java.util.Scanner;

public class CountOfWordsInString {
    public static void countWords2(String str){
        int count = 1;
        if (str.charAt(0) == ' ') {
            count = 0;
        }
        //if (str.charAt(0)!=' ') {
        //    count = 1;
        //}
        for(int i = 0; i <str.length()-1; i++){
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void countWords(String str){
        String[] words = str.split(" ");
        System.out.println(words.length);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        countWords2(str);
        s.close();
    }
}
