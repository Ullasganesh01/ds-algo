package code_forces_solns;
//https://codeforces.com/problemset/problem/1873/C

import java.util.Scanner;

public class TargetPractice {
    public static void noOfPoints(String[] arr,int size){
        int points=0;
        for(int i=0; i<size; i++){
            if(arr[i].contains("X")){
                for(int j=0; j<size; j++){
                    if(arr[i].charAt(j) == 'X'){
                        if (i == 0 || i == 9 || j == 0 || j == 9) {
                            points += 1;
                        }else
                        if (i == 1 || i == 8 || j == 1 || j == 8) {
                            points += 2;
                        }else
                        if (i == 2 || i == 7 || j == 2 || j == 7) {
                            points += 3;
                        }else
                        if (i == 3 || i == 6 || j == 3 || j == 6) {
                            points += 4;
                        }else{
                            points += 5;
                        }
                    }
                }  
            }
        }
        System.out.println(points);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while (n-- > 0) {
            String[] arr = new String[10];
            for (int i = 0; i < 10; i++) {
                
                arr[i] = s.nextLine().toUpperCase();
            }
            noOfPoints(arr,10);
        }
        s.close();
    }
}
