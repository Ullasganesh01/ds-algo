package basic_java_prog;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void findFactors(int num){
        int count =0;
        System.out.println("Factors : ");
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Number of factors : " + count);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        findFactors(num);
        s.close();
    }
}
