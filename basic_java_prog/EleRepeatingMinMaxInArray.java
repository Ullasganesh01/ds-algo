package basic_java_prog;

import java.util.Scanner;
//sorted array
public class EleRepeatingMinMaxInArray {
    public static void elementReapeatingMaxTimes(int arr[]){
        int count = 1;
        int maxEle = 0;
        int maxCount = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }else{
                if(count>maxCount){
                    maxCount = count;
                    maxEle = arr[i];
                }
                count =1;
            }
        }
        if(count>maxCount){
            maxCount =count;
            maxEle = arr[arr.length-1];
        }
        System.out.println("Element repeating maximum no of times : " + maxEle);
    }

    public static void elementReapeatingMinTimes(int arr[]){
        int count = 1;
        int minEle = 0;
        int minCount = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }else{
                if(count<minCount){
                    minCount = count;
                    minEle = arr[i];
                }
                count =1;
            }
        }
        if(count<minCount){
            minCount =count;
            minEle = arr[arr.length-1];
        }
        System.out.println("Element repeating minimum no of times : " + minEle);
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
        elementReapeatingMaxTimes(arr);
        elementReapeatingMinTimes(arr);
        s.close();
    }
}
