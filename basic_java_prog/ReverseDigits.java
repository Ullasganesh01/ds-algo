package basic_java_prog;

//package basic_java_prog;

import java.util.Scanner;

public class ReverseDigits {
    public static long reverse(int x){
        long result=0;
        long xRemaining = Math.abs(x);
        while (xRemaining!=0){
            result = result*10 + xRemaining % 10;
            xRemaining /= 10;
        }
        return x<0 ? -result : result; 
       }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int res = s.nextInt();
       long result = reverse(res);
       System.out.println(result);
       s.close(); 
    }
}
