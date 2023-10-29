package code_forces_solns;
//https://codeforces.com/problemset/problem/1872/A

import java.util.Scanner;

public class TwoVessels {
    public static void pour(double a,double b,double c){
        int moves = 0;
        double mid = (a+b)/2;
        while (a!=b) {
            if(a<b){
               double temp = a;
               a = b;
               b = temp; 
            }
            if (a-c>mid) {
                a = a-c;
                b = b+c;
                moves++;
            }else{
                double diff = a-mid;
                a = a-diff;
                b = b+diff;
                moves++;
            }
        }
        System.out.println(moves);   
    }

    public static void pour2(double a,double b,double c){
        double d = Math.abs(a - b) / 2.0;
        System.out.println((int) Math.ceil(d / c));
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-->0) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();
            if ((a>=1 && a<=100)&&(b>=1 && b<=100)&&(c>=1 && c<=100))  {
                pour(a, b, c);
            }
        }
        s.close();
    }
}
