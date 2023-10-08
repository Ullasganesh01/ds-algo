package basic_java_prog;

import java.util.Scanner;

public class ConsonantsAndVowelsInString {
    public static int getVowelCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                if(c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                    count++;
                }
            } 
        }
        return count;
    }

    public static int getConsonantsCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                if(!(c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')){
                    count++;
                }
            } 
        }
        return count;
    }

    public static int getDigitsCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='0'&&c<='9'){
                count++;
            } 
        }
        return count;
    }

    public static int getSpecialCharCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!((c>='0'&&c<='9')||(c>='A'&&c<='Z')||(c>='a'&&c<='z'))){
                count++;
            } 
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println("Vowel count : " + getVowelCount(str));
        System.out.println("Consonant count : " + getConsonantsCount(str));
        System.out.println("Digit count : " + getDigitsCount(str));
        System.out.println("Special character count : " + getSpecialCharCount(str));
        s.close();
    }
}
