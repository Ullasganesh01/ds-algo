package code_forces_solns;
//https://codeforces.com/problemset/problem/617/A

import java.util.Scanner;

public class ElephantSteps {
    public static int noOfSteps(int destination){
        int steps = 0;
        //int num = 0;
        if(destination == 1 || destination == 2 || destination == 3 || destination == 4 || destination == 5){
            return steps+1;
        }else{
            steps++;
            destination -= 5;
            return steps+noOfSteps(destination);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int friendsCoordinate = s.nextInt();
        if(friendsCoordinate >= 1 && friendsCoordinate <= 1000000){
            System.out.println(noOfSteps(friendsCoordinate));
        }
        s.close();
    }
}
