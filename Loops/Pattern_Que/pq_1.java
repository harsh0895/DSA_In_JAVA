package Loops.Pattern_Que;


import java.util.Scanner;

public class pq_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();
  /*
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *

   */
        for( int i=1; i<=row; i++ ){
            for( int j=1; j<=col; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

    /*
        1 1 1 1 1
        2 2 2 2 2
        3 3 3 3 3
        4 4 4 4 4
     */

        for( int i=1; i<=row; i++ ){
            for( int j=1; j<=col; j++ ){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
