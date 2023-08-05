package arrays;

public class MergeTwoArrays {
    public static void merge(int arr1[], int arr2[], int n, int m) {
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                System.out.print(arr2[j]);
                j++;
            }
            else{
                System.out.print(arr1[j]);
                i++;
                j++;
            }
        }
        while(j<m){
            System.out.print(arr2[j]);
            j++;
        }
        while(i<n)
        {
            System.out.print(arr1[j]);
            i++;
        }
        
        
    }
    public static void main(String[] args) {
        int[] arr1={1, 3, 5, 7};
        int[] arr2={0, 2, 6, 8, 9};
        int n=4;
        int m=5;
        merge(arr1, arr2, n, m);

    }
}
