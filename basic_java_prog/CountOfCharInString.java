package basic_java_prog;

import java.util.Scanner;

public class CountOfCharInString {
    public static int countOfCharInString(String s,char c){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(c == (s.charAt(i))){
                count++;
            }
        }
        return count; 
    }
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.next();
    char c = s.next().charAt(0);
    System.out.println(countOfCharInString(str, c));
    s.close();
   } 
}
