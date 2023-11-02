package basic_java_prog;

import java.util.Scanner;

public class RemoveCharsAndVowelsInString {
    public static void removeVowels(String str){
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)!='A' && str.charAt(i)!='E' && str.charAt(i)!='I' && str.charAt(i)!='O' && str.charAt(i)!='U' && str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u'){
                newStr = newStr+str.charAt(i);
            }
        }
        System.out.println(newStr);
    }

    public static void removeSpecialCharacters(String str){
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if ((ch >= '0' && ch <= '9') ||(ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
                newStr = newStr+ch;
            }
        }
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        removeVowels(str);
        removeSpecialCharacters(str);
        s.close();
    }
}
