package code_forces_solns;
//https://codeforces.com/problemset/problem/977/A

import java.util.Scanner;

public class WrongSubtraction {
    public static void subtract(long num,int time){
        while (time-->0) {
            if (num%10 == 0) {
                num = num/10;
            }
            else{
                num = num - 1;
            }
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long num = s.nextInt();
        int time = s.nextInt();
        if (num>=2 && time<=50) {
            subtract(num, time);
        }
        s.close();
    }
}
