package code_forces_solns;
//https://codeforces.com/problemset/problem/58/A
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatRoom {
    public static void findPattern(String x){
        if(x.length() >= 1&& x.length() <= 100){
            Pattern pattern = Pattern.compile(".*h+.*e+.*l+.*l+.*o+.*");
            Matcher m = pattern.matcher(x);
            if(m.find()){
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

    public static void chat(String s){
        if(s.matches(".*h.*e.*l.*l.*o.*"))
            System.out.println("YES");
         else   
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.next();
        findPattern(x);
        s.close();
    }
}
