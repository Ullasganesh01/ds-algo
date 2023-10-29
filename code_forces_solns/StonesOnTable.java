package code_forces_solns;
//https://codeforces.com/problemset/problem/266/A

import java.util.Scanner;

public class StonesOnTable {
    public static void count(String st){
        int count = 0;
        for(int i=0;i<st.length()-1;i++){
            if (st.charAt(i) == st.charAt(i+1)) 
                count++;          
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String st = s.next();
        if (st.length() == n) {
            count(st);
        }
        s.close();
    }
}
