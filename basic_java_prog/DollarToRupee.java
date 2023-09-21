package basic_java_prog;
import java.util.Scanner;

public class DollarToRupee{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to exchange : ");
        int noOfDollar = s.nextInt();
        double scale = Math.pow(10, 4);
        double rupees = (double)Math.round((noOfDollar*82.73)*scale)/scale;

        System.out.format("The converted amount is %.4f rupees",rupees);
        s.close();
    }
}