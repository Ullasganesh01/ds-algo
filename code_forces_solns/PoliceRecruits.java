package code_forces_solns;
//https://codeforces.com/problemset/problem/427/A

import java.util.Scanner;

public class PoliceRecruits {
    public static void noOfCrimesUntreated(int[] arr){
        int count = 0;
        int free = 0;
        for(int i : arr){
            if(i>0){
                free = free+i;
            }else if(i<0 && free>0){
                free--;
            }else if(i<0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        boolean isValid = true;
        for(int i : arr){
            if (i < -1 && i>10) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            noOfCrimesUntreated(arr);
        }
        s.close();
    }
}
