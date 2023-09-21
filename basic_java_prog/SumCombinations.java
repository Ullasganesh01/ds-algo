package basic_java_prog;

import java.util.Scanner;

public class SumCombinations {
    public static int noOfComb(int size){
        if(size == 2){
            return 1;
        }
        if(size == 3){
            return 3;
        }
        if(size > 3){
            int sum=0;
            for (int i=1;i<size;i++){
                sum = sum + i;
            }
            return sum;
        }
        return 0;
    }
    public static boolean check(int arr[],int ele){
        for(int i : arr){
            if(i == ele){
                return true;
            }
        }
        return false;
    }
    public static void sumCombinations(int arr[],int size){
        System.out.println("Sum combinations : ");
        int combSize = noOfComb(size);
        int newArr[] = new int[combSize];
        int newInd =0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(!(i == j)){
                    int num = arr[i] + arr[j];
                    if(!(check(newArr, num))){
                        newArr[newInd++] = num;
                    }   
                }
            }
        }
        for(int i : newArr){
            if(i != 0){
                System.out.print(i + " ");
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
        //System.out.println(noOfComb(size));
        sumCombinations(arr,size);
        
        s.close();

    }
}
