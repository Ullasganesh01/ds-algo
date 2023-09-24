package basic_java_prog;

import java.util.Scanner;

public class PairsInArray {
    public static void printAllPairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[i] + "    " + arr[j]);
            }
        }
    } 
    public static void printPairsIfItMatchesSum(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == k){
                    System.out.println(arr[i] + "    " + arr[j]);
                }
            }
        }
    } 

    public static void printGreatestPairs(int arr[]){
        int max = Integer.MIN_VALUE;
        int maxEle1 = 0;
        int maxEle2 = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] > max){
                    max = arr[i]+arr[j];
                    maxEle1 = arr[i];
                    maxEle2 = arr[j];
                }
            }
        }
        System.out.println("Greatest pairs : " + maxEle1 + "  " + maxEle2 + " with sum : " + max );
    }
    public static void printGreatestPairs2(int[] arr){
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i]> max){
                max2 = max;
                max = arr[i];
            }else if(arr[i] > max2 && arr[i] != max){
                max2 = arr[i];
            }           
        }
        //System.out.println("Max element : " + max);
        if(max2 == Integer.MIN_VALUE){
            max2 = max;
        }
        //System.out.println("Second largest element : " + max2);
        int sum = max+max2;
        System.out.println("Greatest pairs : " + max + "  " + max2 + " with sum : " +  sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = s.nextInt();
        //int arr1[] = {2,1,4,5,7};
        int arr[] = new int[size];
        System.out.println("enter the elements : ");
        for(int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }
        printAllPairs(arr);
        System.out.println();
        printPairsIfItMatchesSum(arr, 9);
        System.out.println();
        printGreatestPairs(arr);
        System.out.println();
        printGreatestPairs2(arr);
        s.close();
    }
}
