package basic_java_prog;

public class StarPattern {
    public static void pat1(int n){ // full square 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pat2(int n){ //half triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pat3(int n){ //reversed half traingle
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pat4(int n){ //full triangle
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");  //space after *
            }
            System.out.println();
        }
    }

    public static void pat5(int n){ //square
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pat6(int n){ // triangle
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || i==n || i==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }  
            }
            System.out.println();
        }
    }

    public static void pat7(int n){ //to print A
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==1&&j!=1)&&(i==1&&j!=n) || (i!=1&&j==1) || (i==n-n/2) || (i!=1&&j==n)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
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
        System.out.println();
        pat6(n);
        System.out.println();
        pat7(n);
    }
}
