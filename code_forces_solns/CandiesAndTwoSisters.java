package code_forces_solns;
//https://codeforces.com/problemset/problem/1335/A

import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void noOfWays(long n){
        long a = n-1;
        long b = 1;
        long count = 0;
        while (a>b) {
            count++;
            a--;
            b++;
        }
        System.out.println(count);
    }

    public static void noOfWays2(long n){
        long count = (n-1)/2;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            long n = s.nextInt();
            if(n>2){
                noOfWays2(n);
            }else{
                System.out.println(0);
            }
        }
        s.close();
    }
}
