package basic_java_prog;

import java.util.Scanner;
//sorted array
public class MinMaxRepeatEleInArray {
    public static void smallestRepeatingEle(int arr[]){
        //int count=1;
        System.out.println("Smallest repeating element : ");
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                //count++;
                System.out.println(arr[i]);
                return ;
            }
        }
    }

    public static void largestRepeatingEle(int arr[]){
        //int count=1;
        System.out.println("Largest repeating element : ");
        for(int i=arr.length-1;i>0;i--){
            if(arr[i] == arr[i-1]){
                //count++;
                System.out.println(arr[i]);
                return ;
            }
        }
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
        smallestRepeatingEle(arr);
        largestRepeatingEle(arr);
        s.close();
    }
}
