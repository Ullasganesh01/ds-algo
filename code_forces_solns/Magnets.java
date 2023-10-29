package code_forces_solns;
//https://codeforces.com/problemset/problem/344/A

import java.util.Scanner;

public class Magnets {
    public static void groupOfMagnets(int[] arr){
        int count = 1;
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] != arr[i+1]) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        groupOfMagnets(arr);
        s.close();
    }
}
