package basic_java_prog;

import java.util.Scanner;

public class CheckAndPrintPrime {
    public static boolean checkPrime(int num){
        int count = 1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
                break;  //for non prime numbers
            }
        }
        if(count == 1){
            //System.out.println("Prime");
            return true;
        }else{
            //System.out.println("Not Prime");
            return false;
        }
    }

    public static void printPrime(int range){
        for(int i=1;i<=range;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void printPrime2(int range){
        for(int i=1;i<=range;i++){
            int count = 1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(i);
            } 
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime : ");
        int n = s.nextInt();
        //checkPrime(n);
        printPrime2(n);
        s.close();

    }
}
