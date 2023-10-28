package code_forces_solns;
//https://codeforces.com/problemset/problem/1873/G
import java.util.Scanner;
//Unsolved

public class ABBCorBACB {
    public static int getCoins(String s){
        int coins = 0;
        String ab = "AB";
        String ba = "BA";
        String bc = "BC";
        String cb = "CB";
        if(s.length()<=1){
            return 0;
        }
        if(s.contains(ab)||s.contains(ba)) {
            String replacedString = "";
            coins++;
                if(s.contains(ab)&&s.contains(ba)){
                    if(s.indexOf(ab)<s.indexOf(ba)){
                        replacedString = s.replaceFirst(ab, bc); 
                        return coins + getCoins(replacedString);    
                    }else{ 
                        replacedString = s.replaceFirst(ba, cb);
                        return coins + getCoins(replacedString);          
                    }    
                }else if(s.contains(ab)){
                    replacedString = s.replaceFirst(ab, bc); 
                    return coins + getCoins(replacedString);    
                }else if(s.contains(ba)){
                    replacedString = s.replaceFirst(ba, cb);
                    return coins + getCoins(replacedString);       
                } 
        }
        return coins;
    }

    public static int getCoins2(String s){
        int coins = 0;
        String ab = "AB";
        String ba = "BA";
        String bc = "BC";
        String cb = "CB";
        boolean containsAB = s.contains(ab);
        boolean containsBA = s.contains(ba);
        if(s.length()<=1){
            return 0;
        }
        if(containsAB||containsBA) {
            String replacedString = "";
            coins++;
                if(containsAB&&containsBA){
                    if(s.indexOf(ab)<s.lastIndexOf(ba)){
                        replacedString = s.replaceFirst(ba, cb); 
                        return coins + getCoins2(replacedString);    
                    }else{ 
                        replacedString = s.replaceFirst(ab, bc);
                        return coins + getCoins2(replacedString);          
                    }    
                }else if(containsAB){
                    replacedString = s.replaceFirst(ab, bc); 
                    return coins + getCoins2(replacedString);    
                }else if(containsBA){
                    replacedString = s.replaceFirst(ba, cb);
                    return coins + getCoins2(replacedString);       
                } 
        }
        return coins;
    }
    public static void flipAndReturnCoins(String[] s){
        int[] coins = new int[s.length];
        for(int i=0;i<s.length;i++){
            coins[i] = getCoins2(s[i]);
        }
        
        for(int i : coins){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter the no of test cases : ");
        int noOfTestCases = s.nextInt();
        String[] testCases = new String[noOfTestCases];
        for(int i=0; i<noOfTestCases;i++){
            //System.out.println("enter the string :");
            testCases[i] = s.next();
        }
        flipAndReturnCoins(testCases);
        s.close();
    }
}
