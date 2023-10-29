package code_forces_solns;
//https://codeforces.com/problemset/problem/110/A

import java.util.Scanner;

public class NearLuckyNumber {
    public static void check(String num){
        int count=0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='4'||num.charAt(i)=='7')
                count++;
        }
        if(count==4||count==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.next();
        check(num);
        s.close();
    }
}
