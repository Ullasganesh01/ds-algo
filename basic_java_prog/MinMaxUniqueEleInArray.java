package basic_java_prog;

import java.util.Scanner;
//sorted array
public class MinMaxUniqueEleInArray {
    public static void smallestUniqueNum(int arr[]){
        int count = 1;
        //boolean b = false;
        System.out.println("Smallest unique number : ");
        for(int i=0; i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }else{
                if(count == 1){
                    System.out.println(arr[i]);
                    //b=true;
                    return;
                }
                count = 1;
            }
        }
        if(count == 1){
            System.out.println(arr[arr.length-1]);
        }
    }

    public static void largestUniqueNum(int arr[]){
        int count = 1;
        //boolean b = false;
        System.out.println("Largest unique number : ");
        for(int i=arr.length-1; i>0;i--){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                if(count == 1){
                    System.out.println(arr[i]);
                    //b=true;
                    return;
                }
                count = 1;
            }
        }
        if(count == 1){
            System.out.println(arr[0]);
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
        smallestUniqueNum(arr);
        largestUniqueNum(arr);
        s.close();
    }
}
