package basic_java_prog;

public class EvenOddClassArray {
    public static void main(String[] args) {
        int arr[] = {2,5,3,4,7,6,10,9,1,8};
        int nxtEven = 0 ;
        int nxtOdd = arr.length-1;
        while(nxtEven < nxtOdd){
            if(arr[nxtEven]%2==0){
                nxtEven++;
            }else{
                int temp = arr[nxtEven];
                arr[nxtEven] = arr[nxtOdd];
                arr[nxtOdd--]=temp;    
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
