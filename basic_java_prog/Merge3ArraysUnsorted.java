package basic_java_prog;

import java.util.Scanner;

public class Merge3ArraysUnsorted {
    public static void merge(int[] a,int[] b,int[] c){
        int res[] = new int[a.length+b.length+c.length];
        int i=0,k=0;
        while(k<res.length){
            if(i<a.length){
                res[k] =a[i];
                k++;
            }
            if(i<b.length){
                res[k] =b[i];
                k++;
            }
            if(i<c.length){
                res[k] =c[i];
                k++;
            }
            i++;
        }
        System.out.println("Merged array : ");
        for (int j : res) {
            System.out.print(j + " ");
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
        System.out.println("Enter the size : ");
        int size2 = s.nextInt();
        int arr2[] = new int[size2];
        System.out.println("enter the elements : ");
        for(int i=0;i<size2;i++){
            arr2[i] = s.nextInt();
        }
        System.out.println("Enter the size : ");
        int size3 = s.nextInt();
        int arr3[] = new int[size3];
        System.out.println("enter the elements : ");
        for(int i=0;i<size3;i++){
            arr3[i] = s.nextInt();
        }
        merge(arr, arr2, arr3);
        s.close();
    }
}
