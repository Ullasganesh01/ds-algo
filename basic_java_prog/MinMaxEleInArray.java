package basic_java_prog;

import java.util.Scanner;

public class MinMaxEleInArray {
    public static void findMinMax(int arr[]){
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element : " + min);
        System.out.println("Maximum element : " + max);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements : ");
        for(int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }
        findMinMax(arr);
        s.close();
    }
}
