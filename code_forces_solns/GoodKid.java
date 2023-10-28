package code_forces_solns;
//https://codeforces.com/problemset/problem/1873/B

import java.util.Arrays;
import java.util.Scanner;

public class GoodKid {
    public static long getMaxElement(int[] a){
        long newProduct = 1;
        for(int i=0; i<a.length; i++){
            newProduct = newProduct *a[i];
        }
        return newProduct;
    }
    public static long getProduct(int[] a){
        long[] newArr = new long[a.length];
        for(int i=0;i<a.length;i++){
            int arr[] = Arrays.copyOf(a,a.length);
            arr[i] = a[i]+1;
            newArr[i] = getMaxElement(arr);
        }
        Arrays.sort(newArr);
        return newArr[newArr.length-1];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int noOfTestCases = s.nextInt();
        int[] size = new int[noOfTestCases];
        int[][] data = new int[noOfTestCases][];
        if(noOfTestCases>=1 && noOfTestCases <= 10000){ 
            for(int i=0; i<noOfTestCases; i++){
                size[i] = s.nextInt();
                if(size[i]>=1 && size[i]<=9){
                    data[i] = new int[size[i]]; 
                    for(int j=0; j<size[i]; j++){
                        data[i][j] = s.nextInt();
                    }
                }
            }
        }
        for(int i=0; i<noOfTestCases; i++){
            System.out.println(getProduct(data[i]));
        }
        s.close();
    }
}
