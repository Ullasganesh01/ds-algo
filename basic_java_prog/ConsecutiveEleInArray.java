package basic_java_prog;

import java.util.Scanner;

public class ConsecutiveEleInArray {
    public static void consecutiveElements(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean con = false;
            if(arr[i+1] == arr[i]+1){
                System.out.print(arr[i] + " ");
                con = true;
            }
            else{
                System.out.println(arr[i]);
                con = false;
            }
            if(con == true && i == arr.length-2){
                System.out.print(arr[arr.length-1]);
            }
            if(con == false && i == arr.length-2){
                System.out.println(arr[arr.length-1]);
            }  
        }
    }

    public static void consecutiveElements2(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean found = false;
            if(arr[i] == arr[i+1]-1){
                found = true;
                System.out.print(arr[i] + " ");
            }else{
                System.out.println(arr[i]);
            }

            if(found  && arr[i+1] == arr[arr.length-1]){
                System.out.print(arr[i+1]);
            }
            if(found == false && arr[i+1] == arr[arr.length-1]){
                System.out.println(arr[i+1]);
            }
        }
    }

    public static void consecutiveElementsCount(int[] arr){
        int count = 1;
        int total = 0;
        for(int i=0; i<arr.length-1; i++){
            boolean found = false;
            if(arr[i] == arr[i+1]-1){
                found = true;
                count++;
            }else{
                if(count!=1){
                    total = total + 1;
                }
                System.out.println(count);
                
                count = 1;
            }
            if(found  && arr[i+1] == arr[arr.length-1]){
                System.out.println(count);
            }
            if(found == false && arr[i+1] == arr[arr.length-1]){
                count=1;
                System.out.println(count);
            }
        }
        System.out.println("Total count: " + total);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = {101,42,43,54,27,28,98,1,2,3,5,7,8,9,11};
        //System.out.println("Enter the size : ");
        //int size = s.nextInt();
        //int arr[] = new int[size];
        //System.out.println("enter the elements : ");
        //for(int i=0;i<size;i++){
        //    arr[i] = s.nextInt();
        //}
        consecutiveElements(a);
        System.out.println();
        consecutiveElementsCount(a);
        s.close();
    }
}
