package basic_java_prog;

public class NumberSquarePattern {

    public static void pat1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pat2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pat3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i*j<10){
                    System.out.print("0" + (i*j) + " ");
                }else{
                    System.out.print(i*j + " ") ;
                }
                
            }
            System.out.println();
        }
    }

    public static void pat4(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+j + " ");
            }
            System.out.println();
        }
    }

    public static void pat5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =5;
        pat1(n);
        System.out.println();
        pat2(n);
        System.out.println();
        pat3(n);
        System.out.println();
        pat4(n);
        System.out.println();
        pat5(n);
    }
}
