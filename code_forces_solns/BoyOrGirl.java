package code_forces_solns;
//https://codeforces.com/problemset/problem/236/A
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String userName = s.next();
        int count = (int)userName.chars().distinct().count();
        if(count%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
        s.close();
    }
}
