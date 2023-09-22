package basic_java_prog;

import java.util.Scanner;

public class SecLargestEleArray {
    public static void secLargest(int arr[]){
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
        System.out.println("Max element : " + max);
        if(max2 == Integer.MIN_VALUE){
            max2 = max;
        }
        System.out.println("Second largest element : " + max2);
    }

    public static void secSmallest(int arr[]){
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i] < min){
                min2 = min;
                min = arr[i];     
            }else if(arr[i] < min2 && arr[i] != min){
                min2 = arr[i];
            }           
        }
        System.out.println("Min element : " + min);
        if(min2 == Integer.MAX_VALUE){
            min2 = min;
        }
        System.out.println("Second smallest element : " + min2);
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
        secLargest(arr);
        secSmallest(arr);
        s.close();
    }
}
