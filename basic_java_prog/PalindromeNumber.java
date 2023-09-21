package basic_java_prog;

//package basic_java_prog;

public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        if (x<0){
            return false;
        }
        final int numDigits = (int)(Math.floor(Math.log10(x)))+1;
        int msd = (int)Math.pow(10, numDigits-1);
        for(int i=0;i<(numDigits/2);++i){
            if(x/msd != x%10){
                return false;
            }
            x %= msd;
            x /= 10;
            msd /= 100;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean ans = isPalindrome(101);
        if(ans==true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        } 
    }
}
