package basic_java_prog;

import java.util.Scanner;

public class SubString {
    public static void printSubStrings(String str,int size){
        for(int j=0;j<=str.length()-size;j++) {
        String t="";
            for(int i=j;i<size+j;i++) {
            	t=t+str.charAt(i);
            }
            System.out.println(t);
	    }
    }

    public static void printAllSubstrings(String str){
        for(int size=1;size<=str.length();size++) {
        	for(int j=0;j<=str.length()-size;j++) {
               String t="";
               for(int i=j;i<size+j;i++) {
               	t=t+str.charAt(i);
               }
               System.out.println(t);
        	}
        }
    }

    public static void checkSubStringPalindrome(String str,int size){
        for(int j=0;j<=str.length()-size;j++) {
          String t="";
          for (int i = j; i < size + j; i++) {
              t = t + str.charAt(i);
          }
          String f = "";
          for (int i = t.length() - 1; i >= 0; i--) {
              f = f + t.charAt(i);
          }
          if (f.equals(t)) {
              System.out.println(t);
          }
    	}
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int size = s.nextInt();
        printSubStrings(str, size);
        System.out.println();
        printAllSubstrings(str);
        System.out.println();
        checkSubStringPalindrome(str, size);
        s.close();
    }
}
