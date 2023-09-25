package basic_java_prog;

import java.util.Scanner;

public class RepeatingEleIn2Arrays {
    public static void findRepeatingEle(int[] a,int[] b){
        int count=0;
        System.out.println("Repeating elements : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]&&count<1) {
					System.out.println(a[i]);
					count++;
				}
			}
			count=0;
		}
    }

    public static void findRepeatingEleInSortedArray(int[] a,int[] b){
        int i=0,k=0;
        System.out.println("Repeating elements : ");
        while(i<a.length&&k<b.length) {
			if(a[i]==b[k]) {
				System.out.println(a[i]);
				i++;
				k++;
			}
			else if(a[i]<b[k]) {
				i++;
			}
			else {
				k++;
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
        System.out.println("Enter the size : ");
        int size2 = s.nextInt();
        int arr2[] = new int[size2];
        System.out.println("enter the elements : ");
        for(int i=0;i<size2;i++){
            arr2[i] = s.nextInt();
        }
        findRepeatingEle(arr, arr2);
        findRepeatingEleInSortedArray(arr, arr2);
        s.close();
    }
}
