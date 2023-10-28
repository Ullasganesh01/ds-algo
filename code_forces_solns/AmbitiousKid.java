package code_forces_solns;
//https://codeforces.com/problemset/problem/1866/A
import java.util.Arrays;
import java.util.Scanner;

public class AmbitiousKid {
    public static int getSmallestNumber(int[] a){
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0; i<a.length; i++){
            if(a[i] == 0){
                return i;
            }else if(a[i] > 0 && a[i] < smallest){
                smallest = a[i];
                index = i;
                break;
            }
        }
        if(index >=0){
            return index;
        }
        else{
            return 0;
        }
        
    }
    public static int getMinNoOfOperations(int[] a){
        int len = a.length;
        int minIndex = 0;
        if(len == 1){
            return Math.abs(a[0]);
        }else{
            Arrays.sort(a);
            if(len == 2){
                if(a[minIndex] == 0){
                    return 0;
                }else if(Math.abs(a[minIndex])<Math.abs(a[minIndex+1])){
                    return Math.abs(a[minIndex]);
                }else{
                    return Math.abs(a[minIndex+1]);
                }
            }else{
                minIndex = getSmallestNumber(a);
                if(minIndex > 0){
                    if(Math.abs(a[minIndex-1])<Math.abs(a[minIndex])){
                        return Math.abs(a[minIndex-1]);
                    }else{
                        return a[minIndex];
                    }
                }else{
                    return Math.abs(a[minIndex]);
                }
                
            }
        }
    }
        //public static int getMinNoOfOperations2(int[] a){
        //    int len = a.length;
        //    //int count = 0;
        //    if(len == 1){
        //        return Math.abs(a[0]);
        //    }
        //    Arrays.sort(a);
        //    int i=0;
        //        if(a[i] == 0){
        //            return 0;
        //        }else if(a[i] < 0){
        //            a[i] = Math.abs(a[i]);
        //            //Arrays.sort(a);
        //            return getMinNoOfOperations2(a);
        //        }else{
        //            return a[i];
        //        }
        //    //return count;
        //}
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(getMinNoOfOperations(arr));
        s.close();
    }
}
