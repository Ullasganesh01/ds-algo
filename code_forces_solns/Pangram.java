package code_forces_solns;
//https://codeforces.com/problemset/problem/520/A

import java.util.Scanner;

public class Pangram {
    public static void checkPangram(String str){
        System.out.println(str.toLowerCase().chars().distinct().count()==26?"YES":"NO");
    }
    public static void checkPangram2(String str){
        boolean found[] = new boolean[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                found[ch-'A'] = true;
            } 
        }
        boolean isPangram = true;
        for(int i=0; i<26;i++){
            if (found[i] == false) {
                isPangram = false;
            }
        }
        if (isPangram) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next().toUpperCase();
        if (str.length() == n && str.length()>=26) {
            checkPangram2(str);
        }else{
            System.out.println("NO");
        }
        s.close();
    }
}
