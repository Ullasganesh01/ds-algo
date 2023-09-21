package basic_java_prog;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + num%10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Sum : " + sumOfDigits(num));
        s.close();
    }
}
