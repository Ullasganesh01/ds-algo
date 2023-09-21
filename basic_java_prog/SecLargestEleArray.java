package basic_java_prog;

import java.util.Scanner;

public class SecLargestEleArray {
    public static void secLargest(int arr[]){
        int max = arr[0];
        int max2 = arr[0];

        for(int i=0; i<arr.length;i++){
            if(arr[i]> max){
                max2 = max;
                max = arr[i];
            }else if(arr[i] > max2 && arr[i] != max){
                max2 = arr[i];
            }           
        }
        System.out.println("Max element : " + max);
        System.out.println("Second largest element : " + max2);
    }

    public static void secSmallest(int arr[]){
        int min = arr[0];
        int min2 = arr[0];

        for(int i=0; i<arr.length;i++){
            if(arr[i] < min2){
                min = min2;
                min2 = arr[i];     
            }else if(arr[i] < min && arr[i] != min2){
                min = arr[i];
            }           
        }
        System.out.println("Min element : " + min);
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
