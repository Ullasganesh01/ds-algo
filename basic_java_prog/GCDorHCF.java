package basic_java_prog;

import java.util.Scanner;

public class GCDorHCF {
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
 
        if (a == b)
            return a;
 
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }

    public static void printDivisors(int m,int n){
        int min;
		if(m<n) {
			min=m;
		}
		else {
			min=n;
		}
		for(int i=1;i<min;i++) {
			if((m%i==0)&&(n%i==0)) {
				System.out.println(i);
			}
		}
    }

    public static void lcd(int m,int n){  //least common divisor
        int min;
		if(m<n) {
			min=m;
		}
		else {
			min=n;
		}
		for(int i=1;i<min;i++) {
			if((m%i==0)&&(n%i==0)) {
				System.out.println("LCD : "+ i);
                break;
			}
		}
    }

    public static void gcd2(int m,int n){  //least common divisor
        int min;
		if(m<n) {
			min=m;
		}
		else {
			min=n;
		}
		for(int i=min;i>=1;i--) {
			if((m%i==0)&&(n%i==0)) {
				System.out.println("GCD : "+ i);
                break;
			}
		}
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println("GCD : " + gcd(num1,num2));
        printDivisors(num1, num2);
        lcd(num1, num2);
        gcd2(num1, num2);
        s.close();
    }
}
