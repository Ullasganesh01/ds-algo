package basic_java_prog;

import java.util.Scanner;
//takes 1st array in descending ordered elements and 2nd array in ascending orderd elements and returns merged array in ascending order
public class Merge2ArraysAscDesc {
    public static void mergeAscDsc(int[] a, int[] b){
      int size = a.length+b.length;
      int c[] = new int[size];
      int k = 0;// for c

      int y = a.length-1; //for a
      int z = 0; //for b

        while(y>=0 && z<b.length) {
		    if(b[z]<=a[y]) {
		    	c[k]=b[z];
		    	k++;
		    	z++;
		    }
		    else {
		    	c[k]=a[y];
		    	k++;
		    	y--;
		    }
	    }
	    while(z<b.length) {
	    	c[k]=b[z];
	    	k++;
	    	z++;
	    }
	    while(y>=0) {
	    	c[k]=a[y];
	    		k++;
	    		y--;
	    }   
        for(int i:c){
            System.out.print(i + " ");
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
        mergeAscDsc(arr, arr2);
        s.close();
    }
}
