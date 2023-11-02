package basic_java_prog;

import java.util.Scanner;

public class CheckStringPresentInString {
    public static void checkSequenceOfString(String str,String sequence){
        int count =0;
        for(int i=0,j=0;i<str.length()&&j<sequence.length();){
            if (str.charAt(i) == sequence.charAt(j)) {
                count++;
                i++;
                j++;
            }else{
                i++;
            }
        }
        if (count == sequence.length()) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String sequence = s.next();
        checkSequenceOfString(str, sequence);
        s.close();
    }
}
