package code_forces_solns;
//https://codeforces.com/problemset/problem/282/A
import java.util.Scanner;

public class BitPlusPlus {
    public static int getValue(String[] values){
        int value = 0;
        for(String s : values){
            if(s.contains("X")){
                if(s.startsWith("++X")){
                    ++value;
                }else if(s.startsWith("--X")){
                    --value;
                }else if(s.endsWith("X++")){
                    value++;
                }else if(s.endsWith("X--")){
                    value--;
                }
            }
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>=1&&n<=150){
            String[] ops = new String[n];
            for(int i = 0; i < n; i++){
                ops[i] = s.next();
            }
            System.out.println(getValue(ops));
        }  
        s.close();
    }
}
