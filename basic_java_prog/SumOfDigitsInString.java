package basic_java_prog;

import java.util.Scanner;

public class SumOfDigitsInString {
    public static void sumOfDigits(String str){
        int sum=0;
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(ch>='0' && ch<='9') {
        		int b=ch-48;
        		sum=sum+b;
        	}
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        sumOfDigits(str);
        s.close();
    }
}
