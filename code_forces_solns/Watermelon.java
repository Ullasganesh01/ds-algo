package code_forces_solns;
//https://codeforces.com/problemset/problem/4/A

import java.util.Scanner;

public class Watermelon {
    public static void divideAndFind(int x){
        if(x > 2){
            if(x%2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        divideAndFind(x);
        s.close();
    }
}
