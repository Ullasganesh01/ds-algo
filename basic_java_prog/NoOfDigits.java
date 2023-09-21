package basic_java_prog;

import java.util.Scanner;

public class NoOfDigits {
    public static int getNoOfDigits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Count : " + getNoOfDigits(num));
        s.close();
    }
}
