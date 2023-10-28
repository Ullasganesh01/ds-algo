package code_forces_solns;
//https://codeforces.com/problemset/problem/1/A
import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        double m = s.nextDouble();
        double a = s.nextDouble();
        long res = (long) ( Math.ceil(n/a) * Math.ceil(m/a));
        System.out.println(res);
        s.close();
    }   
}
