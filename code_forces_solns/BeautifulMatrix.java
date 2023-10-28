package code_forces_solns;
//https://codeforces.com/problemset/problem/263/A

import java.util.Scanner;
public class BeautifulMatrix {
    public static int noOfMoves(int row,int col){
        int moves = 0;
        if(row == 2 && col == 2){
            return moves;
        }
        if(row < 2){
            while(row != 2){
                moves++;
                row++;
            }
        }
        else if(row > 2){
            while(row != 2){
                moves++;
                row--;
            }
        }
        if(col < 2){
            while(col != 2){
                moves++;
                col++;
            }
        }
        else if(col > 2){
            while(col != 2){
                moves++;
                col--;
            }
        }
        return moves;
    }
    public static void main(String[] args) {
        int a[][]= new int[5][5];
        int r = -1;
        int c = -1;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j] == 1){
                    r = i;
                    c = j;
                }
            }
        } 
        System.out.println(noOfMoves(r, c)); 
        sc.close();  
    }    
}
