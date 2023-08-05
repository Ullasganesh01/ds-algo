package arrays;

public class Rervesearray2 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]=new int[arr1.length];
        
        int j=0;
        
        for(int i=arr1.length-1;i>=0;i--){
            
                arr2[j++]=arr1[i];
            }
            
        for(int x=0;x<arr1.length;x++){
                System.out.print(arr1[x]);    
            }
        System.out.println();
        for(int x=0;x<arr2.length;x++){
            System.out.print(arr2[x]);    
        }
        System.out.println();
            
    }
}
