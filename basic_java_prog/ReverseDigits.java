package basic_java_prog;

public class ReverseDigits {
    public static long reverse(int x){
        long result=0;
        long xRemaining = Math.abs(x);
        while (xRemaining!=0){
            result = result*10 + xRemaining % 10;
            xRemaining /= 10;
        }
        return x<0 ? -result : result; 
       }
    public static void main(String[] args) {
       long res = reverse(1132);
       System.out.println(res); 
    }
}
