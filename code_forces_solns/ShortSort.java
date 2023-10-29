package code_forces_solns;
//https://codeforces.com/problemset/problem/1873/A

import java.util.Scanner;

public class ShortSort {
    public static void sortSwap(String s){
        if(s.contains("abc")||s.contains("acb")||s.contains("bac")||s.contains("cba")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            String s = sc.next();
            sortSwap(s);
        }
        sc.close();
    }
}
