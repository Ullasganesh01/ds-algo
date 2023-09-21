package basic_java_prog;

import java.util.Scanner;

public class FullyPrime {

    public static void checkFullyPrime(int num){
       if(checkPrime(num)){
        int n = num;
        while(n > 0){
            int rem = n%10;
            if(checkPrime(rem)){
                n=n/10;
            }else break;
        }
        if(n==0){
            System.out.println("Fully prime");
        }else{
            System.out.println("Not fully prime");
        }
       }else{
        System.out.println("Not prime");
       }
    }

    public static boolean checkPrime(int num){
        int count = 0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        checkFullyPrime(num);
        s.close();
    }
}
