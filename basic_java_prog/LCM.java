package basic_java_prog;

import java.util.Scanner;

public class LCM {
    public static int gcd(int a, int b)
    {   
        System.out.println(a + " " + b);
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    public static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    } 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println("LCM : " + lcm(num1,num2));
        s.close();
    }
}
