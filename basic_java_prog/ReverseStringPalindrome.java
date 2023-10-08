package basic_java_prog;

import java.util.Scanner;

public class ReverseStringPalindrome {
    public static String reverseString(String userString){
        String revString = "";
        for(int i=userString.length()-1; i>=0;i--){
            char c = userString.charAt(i);
            revString += c;
        }
        return revString;
    }

    public static boolean isPalindrome(String userString){
        if(userString.equals(reverseString(userString))){
            System.out.println("It is a palindrome");
            return true;
        }else{
            System.out.println("It is not a palindrome");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //String userString = s.next();
        String name = "lol";
        System.out.println(reverseString(name));
        isPalindrome(name);
        s.close();
    }
}
