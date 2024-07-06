package Loops.Pattern_Que;

import java.util.Scanner;

public class pq_11 {
    public static void main(String[] args) {

        /*
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        int space = 0;

        for( int i=1; i<=row; i++ ){
            space = row-i;
            for( int j=1; j<=space; j++ ){
                System.out.print("  ");
            }
            for( int k=1; k<=i; k++ ){
                System.out.print(k+" ");
            }
            for( int m=i-1; m>=1; m-- ){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
