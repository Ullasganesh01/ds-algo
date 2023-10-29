package code_forces_solns;
//https://codeforces.com/contest/1878/problem/A

import java.util.Scanner;

public class HowMuchDoesDayatonaCosts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int size = s.nextInt();
            int key = s.nextInt();
            int arr[] = new int[size];
            boolean found = false;
            for(int i = 0; i < size; i++){
                arr[i] = s.nextInt();
            }
            for(int i : arr){
                if (i == key) {
                    found = true;
                }
            }
            if(found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        s.close();
    }
}
