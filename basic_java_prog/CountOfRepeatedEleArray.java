package basic_java_prog;

import java.util.Scanner;

public class CountOfRepeatedEleArray {
    public static void countOfRepeatedElements(int a[]){
        int count=1;
        System.out.println("Ele  Count : ");
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				count++;
			}
			else {
				System.out.println(" "+a[i]+"   "+count);
				count=1;
			}
		}
		System.out.println(" "+ a[a.length-1]+"   "+count);
    }
    public static void countOfRepeatedElementsGreaterThanOne(int a[]){
        int count=1;
        System.out.println("Ele  Count : ");
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				count++;
			}
			else {
                if(count>1){
                    System.out.println(" "+a[i]+"   "+count);
                }
				count=1;
			}
		}
        if(count>1){
            System.out.println(" "+ a[a.length-1]+"   "+count);
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
        countOfRepeatedElements(arr);
	countOfRepeatedElementsGreaterThanOne(arr);
        s.close();
    }
}
