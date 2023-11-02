package basic_java_prog;

import java.util.Scanner;

public class StringToStringCases {
    public static void convertToLowerCase(String str){
        String newStr = "";
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z') {
                newStr = newStr + (char)(ch+32);
            }else{
                newStr = newStr + ch;
            }
        }
        System.out.println(newStr);
    }

    public static void convertToUpperCase(String str){
        String newStr = "";
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if (ch>='a' && ch<='z') {
                newStr = newStr + (char)(ch-32);
            }else{
                newStr = newStr + ch;
            }
        }
        System.out.println(newStr);
    }

    public static void converToUpperAndLowerReverse(String str){
        String newStr = "";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                newStr = newStr + (char)(ch+32);
            }else if(ch>='a' && ch<='z'){
                newStr = newStr + (char)(ch-32);
            }
        }
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        convertToLowerCase(str);
        convertToUpperCase(str);
        converToUpperAndLowerReverse(str);
        s.close();
    }
}
