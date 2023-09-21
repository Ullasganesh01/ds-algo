package basic_java_prog;

//package basic_java_prog;

public class NegPosArrangeArray {
    public static void main(String[] args) {
        int a[] = {7 ,-6 ,4 ,5, -6, 7, 3, 5, -3};
        int n = a.length-1;
        int arr[]=new int[n];
        int s=0;
        for( int i=0;i<n;i++){
            if(a[i]<0){
                arr[s]=a[i];
                s++;
            }
        }
        for( int i=0;i<n;i++){
            if(a[i]>=0){
                arr[s]=a[i];
                s++;
            }
        }
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
