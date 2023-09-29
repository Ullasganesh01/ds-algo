package basic_java_prog;
//sub array of size in a continuous order
import java.util.Scanner;

public class SubArraysOfSize {
    public static void subArray(int[] a,int size){
		for(int i=0;i<=a.length-size;i++) {
		    for(int j=i;j<size+i;j++) {
		    	System.out.print(a[j]+" ");
		    }
		    System.out.println();
		}
    }

    public static void sumOfSubArray(int[] a,int size){
        int totalSum = 0;
        System.out.println("Sum of sub arrays : ");
		for(int i=0;i<=a.length-size;i++) {
            int sum = 0;
		    for(int j=i;j<size+i;j++) {
                sum += a[j];
		    }
            totalSum += sum;
		    System.out.println(sum);
		}
        System.out.println("Total sum : " + totalSum);
    }  
    
    public static void countOfSubArray(int[] a,int size,int sum){
        int count = 0;
        for(int i=0;i<=a.length-size;i++) {
            int total = 0; 
		    for(int j=i;j<size+i;j++) {
                total += a[j];
		    }
            if(total == sum){
                count++;
            }
		}
        System.out.println("Count of sub arrays with sum : " + sum + " is : " + count);
    }

    public static void printSubArrayOfSum(int[] a,int size,int sum){
        for(int i=0;i<=a.length-size;i++) {
			int e=0;
			int f=0;
			int g=0;
			int count=0;
			for(int j=i;j<size+i;j++) {
				if(count==0) {
					e=a[j];
					count++;
				}
				else if(count==1) {
					f=a[j];
					count++;
				}
				else if(count==2) {
					g=a[j];
				}
			}
			if((e+f+g)==sum) {
				System.out.println(e+" "+f+" "+g);
			}
	
		}
    }

    public static void printSubArrayOfSum2(int[] a, int size, int sum){
        for(int i=0;i<=a.length-3;i++) {
			int total=0;
			for(int j=i;j<3+i;j++) {
				total=total+a[j];
			}
			if(total==sum) {
				for(int j=i;j<3+i;j++) {
					System.out.print(a[j]+" ");
				}
                System.out.println();	
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
        System.out.println("enter the sub array size less than or equal to : " + size);
        int subSize = s.nextInt();
        
        subArray(arr,subSize);
        sumOfSubArray(arr, subSize);

        System.out.println("enter the total to get the count of sub arrays : " );
        int total = s.nextInt();
        countOfSubArray(arr, subSize, total);

        printSubArrayOfSum(arr, subSize, total);
        System.out.println();
        printSubArrayOfSum2(arr, subSize, total);
        s.close();
    }
}
