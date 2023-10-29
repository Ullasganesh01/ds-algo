package code_forces_solns;
//https://codeforces.com/problemset/problem/266/B

import java.util.Scanner;

public class QueueAtTheSchool {
    public static void swap(String str,int time){
        while (time-->0) {
            if (str.contains("BG")) {
                str = str.replaceAll("BG", "GB");
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int time = s.nextInt();
        if (size>=1 && time<=50) {
            String str = s.next();
            swap(str.toUpperCase(),time);
        }
        s.close();
    }
}
