package code_forces_solns;
//https://codeforces.com/problemset/problem/1882/A

import java.util.Scanner;

public class IncreasingSequence {
    public static void minNum(int[] arr){
        int[] min = new int[arr.length];
        int count;
        if(arr[0]>=2){
            count = 1;
        }else{
            count = 2;
        }
        min[0] = count;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==min[i-1]+1){
                count=count+2;
                min[i] = count;
            }else{
                count++;
                min[i] = count;
            }
        }
        System.out.println(min[min.length-1]);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0) {
            int size = s.nextInt();
            int arr[] = new int[size];
            for(int i = 0; i < size;i++){
                arr[i] = s.nextInt();
            }
            minNum(arr);
        }
        s.close();
    }
}
