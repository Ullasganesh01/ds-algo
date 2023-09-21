package basic_java_prog;

public class SwapTwoNumbers {
    public static void swap(int a,int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a + " " + b);
    }

    public static void swap2(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 7;
        swap(n, m);
        swap2(n, m);
        //System.out.println(n + " " + m);

    }
}
