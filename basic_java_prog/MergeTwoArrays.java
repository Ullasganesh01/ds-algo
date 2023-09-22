package arrays;

public class MergeTwoArrays {
    public static void merge(int arr1[], int arr2[], int n, int m) {
        int mergedArr[] = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<=arr2[j]){
                System.out.print(arr1[i]);
                mergedArr[k] = arr1[i];
                i++;
                k++;
            }
            else if(arr1[i]>arr2[j]){
                System.out.print(arr2[j]);
                mergedArr[k] = arr2[j];
                j++;
                k++;
            }
            //else{
            //    System.out.print(arr1[i]);
            //    mergedArr[k]=arr1[i];
            //    i++;
            //    j++;
            //    k++;
            //}
        }
        
        while(j<m){
            System.out.print(arr2[j]);
            mergedArr[k] = arr2[j];
            k++;
            j++;
        }
        while(i<n)
        {
            System.out.print(arr1[i]);
            mergedArr[k] = arr1[i];
            k++;
            i++;
        }
        
        System.out.println();
        for (int x : mergedArr) {
            System.out.print(x);
        }
        
    }
    public static void main(String[] args) {
        int[] arr1={1, 3, 4, 5, 7};
        int[] arr2={0, 2, 6, 8, 9};
        int n=arr1.length;
        int m=arr2.length;
        merge(arr1, arr2, n, m);

    }
}
