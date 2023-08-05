package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    
        //Function to find the leaders in the array.
        static ArrayList<Integer> leaders(int arr[], int n){
            ArrayList<Integer> res = new ArrayList<>();
           int max = Integer.MIN_VALUE;
           for(int i=n-1;i>=0;i--){
               if(arr[i]>=max){
                   res.add(arr[i]);
                   max = arr[i];
               }
           }Collections.reverse(res);
           return res;
            
        }

        public static void main(String[] args) {
            
        int[] arr={16,17,4,3,5,2};
        int n=6;
        ArrayList<Integer> ans = leaders(arr, n);
        System.out.println(ans);   
        } 
}
