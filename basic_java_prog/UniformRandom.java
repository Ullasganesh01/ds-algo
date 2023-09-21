package basic_java_prog;
//package basic_java_prog;

public class UniformRandom {
    public static int random(int lb,int ub){
        int noOfOutcomes = ub - lb + 1, result;
        do {
            result=0;
            for(int i=0;(1<<i)<noOfOutcomes;++i){
                result = (result<<1) | (int)Math.random();
            }
        } while (result >= noOfOutcomes);
        return result + lb;
    }
     public static void main(String[] args) {
        int res=random(1,6 );
        System.out.println(res);
     }
}
