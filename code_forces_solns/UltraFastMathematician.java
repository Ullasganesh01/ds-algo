package code_forces_solns;
//https://codeforces.com/problemset/problem/61/A

import java.util.Scanner;

public class UltraFastMathematician {
    public static void convert(String s1, String s2){
        String newString = "";
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                newString += "0";
            }else{
                newString += "1";
            }
        }
        System.out.println(newString);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        if (s1.length() == s2.length() && s1.length()<=100) {
            convert(s1, s2);
        }
        s.close();
    }
}
